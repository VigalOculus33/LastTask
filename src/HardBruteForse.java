import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class HardBruteForse extends Alphabet {

    Random random = new Random(20);
    public int key;
    textGetter getter;

    public HardBruteForse() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
    }

    public void Alphabet(textGetter getter) {
        this.getter = getter;
    }
    public char[] FileToChars() throws IOException {

        return getter.text.toCharArray();
    }
    public char[] Alphabet() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        Alphabet alph = new Alphabet();
        return alph.arrayListToChars();
    }
    public String HardBruteForse() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, IOException {

        char[] array = FileToChars();
        int randomkey = 0;
        while (randomkey != key) {
            randomkey = random.nextInt(1, 20);;
            for (int i = 0; i < array.length; i++) {
                char c = array[i];
                int index = Alphabet.alphabet.indexOf(String.valueOf(c));
                array[i] = Alphabet()[(index - randomkey + Alphabet.alphabet.size()) % Alphabet.alphabet.size()];
            }
        }
        System.out.println(new String(array));
        return new String(array);
    }
}




