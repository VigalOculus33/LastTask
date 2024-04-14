import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptorCaesar  extends  Alphabet {

    public int key = 2;

    public textGetter getter;
    public EncryptorCaesar(textGetter getter) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException  {
        this.getter = getter;
    }

    public char[] Alphabet() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        Alphabet alph = new Alphabet();
        return alph.arrayListToChars();
    }
    public char[] fileToChars() {

        return getter.text.toCharArray();
    }


    public String encrypt() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        char[] array = fileToChars();
        char[] copy = array;
        for (int i = 0; i < array.length; i++) {
            char c = copy[i];
            int value = Alphabet.alphabet.indexOf(String.valueOf(c));
            array[i] = Alphabet()[(value + key)%Alphabet.alphabet.size()];
        }

        System.out.println(new String(array));
        return new String(array);
    }
}





