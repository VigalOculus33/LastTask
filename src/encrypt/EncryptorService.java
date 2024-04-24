package encrypt;

import aes.AesEncryptor;
import text.CustomText;
import text.CustomTextService;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

public class EncryptorService implements Encrypt {

    private final AesEncryptor aesEncryptor;
    private final CustomTextService textService;

    public EncryptorService(AesEncryptor aesEncryptor, CustomTextService textService) {
        this.aesEncryptor = aesEncryptor;
        this.textService = textService;
    }

    @Override
    public void encrypt() throws IOException, InvalidAlgorithmParameterException,
            IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        var text = textService.readText();
        var bytes = aesEncryptor.encrypt(text.getText().getBytes(StandardCharsets.UTF_8));
        textService.writeText(new CustomText(new String(bytes)));
    }
}
