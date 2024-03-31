import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class AesEncryptor {
    class SimpleEncryptor extends Cipher {


        /**
         * Creates a {@code Cipher} object.
         *
         * @param cipherSpi      the delegate
         * @param provider       the provider
         * @param transformation the transformation
         * @throws NullPointerException     if {@code provider} is {@code null}
         * @throws IllegalArgumentException if the supplied arguments
         *                                  are deemed invalid for constructing the {@code Cipher} object
         */
        protected SimpleEncryptor(CipherSpi cipherSpi, Provider provider, String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
            super(cipherSpi, provider, transformation);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            KeyGenerator EnKgen = KeyGenerator.getInstance("AES/CBC/PKCS5Padding");
            EnKgen.init(128);
            SecretKey key = EnKgen.generateKey();

            cipher.init(Cipher.ENCRYPT_MODE, key);

        }
    }
}
