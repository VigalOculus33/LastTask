import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class AesDecryptor extends Cipher {
        Cipher cipher;
        SecretKey key;
        IvParameterSpec ivParameterSpec;


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
    protected AesDecryptor(CipherSpi cipherSpi, Provider provider, String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException {
        super(cipherSpi, provider, transformation);
        this.key = key;
        this.ivParameterSpec = ivParameterSpec;
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    }

    public byte[] decrypt(byte[] encryptedData) throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        cipher.init(Cipher.DECRYPT_MODE, key, ivParameterSpec);
        try {
            return cipher.doFinal(encryptedData);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}


