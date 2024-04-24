import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AesEncryptor {
    private Cipher cipher;
    private SecretKey key;
    private IvParameterSpec ivParameterSpec;

    public AesEncryptor() throws NoSuchPaddingException, NoSuchAlgorithmException {
        // Генератор ключа AES
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        this.key = keyGen.generateKey();
    //----------------------------------------------------------------------------------------------------------------------//
        // Генерируем вектор инициализации (IV) для режима шифрования CBC
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[16];
        random.nextBytes(iv);
        this.ivParameterSpec = new IvParameterSpec(iv);
    //----------------------------------------------------------------------------------------------------------------------//
        // Инициализация объекта Cipher для AES с режимом CBC и PKCS5Padding
        this.cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    }
    //----------------------------------------------------------------------------------------------------------------------//
    public byte[] encrypt(byte[] data) throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        // Метод для шифрования данных
        cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
        return cipher.doFinal(data);
    }
    //----------------------------------------------------------------------------------------------------------------------//
    public byte[] decrypt(byte[] encryptedData) throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        cipher.init(Cipher.DECRYPT_MODE, key, ivParameterSpec);
        return cipher.doFinal(encryptedData);
    }
    //----------------------------------------------------------------------------------------------------------------------//
    public SecretKey getSecretKey() {
        // Геттер для получения ключа шифрования
        return key;
    }
    //----------------------------------------------------------------------------------------------------------------------//
    public IvParameterSpec getIvParameterSpec() {
        // Геттер для получения вектора инициализации
        return ivParameterSpec;
    }
}


