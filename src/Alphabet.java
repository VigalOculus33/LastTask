import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Alphabet {

    private static Iterable<? extends String> list;
    ArrayList<String> alphabet = new ArrayList<>(List.of("A", "а", "Б", "б", "В", "в", "Г", "г", "Д", "д", "Е", "е",
            "Ё", "ё", "Ж", "ж", "З", "з", "И", "и", "К", "к", "Л", "л", "Н", "н", "О", "о", "П", "п", "Р", "р", "С", "с", "Т", "т", "У", "у",
            "Ф", "ф", "Х", "х", "Ц", "ц", "Ч", "ч", "Ш", "ш", "Щ", "щ", "Э", "э", "Ю", "ю", "Я", "я", ",", ".", "!", "?", "(", ")", " "));

    byte[] result = arrayListToBytes(alphabet);

    public Alphabet() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
    }

    public static byte[] arrayListToBytes(ArrayList<String> alphabet) {
        StringBuilder builder = new StringBuilder();


        for (String str : list) {

            builder.append(str);
        }
        String concatenatedString = builder.toString();
        return concatenatedString.getBytes();
    }

    public static int indexOf(char c) {
        return c;
    }

    public static char charAt(int keyVal) {
        return (char) keyVal;
    }
    /**
    AesEncryptor aesEncryptor = new AesEncryptor();
    //byte[] encryptedAlphabet = aesEncryptor.encrypt(arrayListToBytes(alphabet));


    //public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
     */

    }
