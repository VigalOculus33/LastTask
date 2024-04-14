
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class DecryptorCaesar {

    public int key = 2;
    public textGetter getter;

    public DecryptorCaesar(textGetter getter){this.getter = getter;}

    public char[] Alphabet() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        Alphabet alph = new Alphabet();
        return alph.arrayListToChars();
    }

    public void Alphabet(textGetter getter) {
        this.getter = getter;
    }
    public char[] FileToChars() throws IOException {

        return getter.text.toCharArray();
    }
    public String decryptorCaesar() throws IOException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        char[] array = FileToChars();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            int index = Alphabet.alphabet.indexOf(String.valueOf(c));

            array[i] = Alphabet()[(index - key+Alphabet.alphabet.size())%Alphabet.alphabet.size()];


        }
        System.out.println(new String(array));
        return new String(array);
        }

    }
