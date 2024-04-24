import aes.AesEncryptor;
import encrypt.Encrypt;
import encrypt.EncryptorService;
import file.PathService;
import text.CustomTextService;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CustomMain {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, IOException, BadPaddingException,
            InvalidKeyException {
        AesEncryptor encryptor = new AesEncryptor();
        Scanner scanner = new Scanner(System.in);
        PathService pathService = new PathService(scanner);
        CustomTextService textService = new CustomTextService(pathService);
        Encrypt encrypt = new EncryptorService(encryptor, textService);
        encrypt.encrypt();
    }


}
