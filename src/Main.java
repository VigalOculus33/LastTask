//import aes.AesEncryptor;
//import encrypt.DecryptorCaesar;
//import encrypt.HardBruteForse;
//import storage.Alphabet;
//import text.TextService;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import java.io.IOException;
//import java.security.InvalidAlgorithmParameterException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) throws IOException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
////        Scanner scanner = new Scanner(System.in);
////
////        TextService getter = new TextService();
////
////        Alphabet.EncryptorCaesar shfr = new Alphabet.EncryptorCaesar(getter);
////
////        DecryptorCaesar deShifr = new DecryptorCaesar(getter);
////
////        HardBruteForse bruteForse = new HardBruteForse();
////
////        AesEncryptor aesEncryptor = new AesEncryptor();
////
////        while (true) {
////
////            System.out.println("Меню");
////            System.out.println("выберите действие");
////            System.out.println("1 зашифровать файл");
////            System.out.println("2 расшифровать файл");
////            System.out.println("3 взломать файл");
////            System.out.println("4 сохранить файл");
////            System.out.println("5 Aes шифрование");
////
////            int comanda = scanner.nextInt();
////            scanner.nextLine();
////
////            if (comanda == 1) {
////                System.out.println("введите адрес файла ");
////                getter.FileGetter();
////                shfr.encrypt();
////                System.out.println("файл зашифрован, сохраните файл");
////
////            }
////
////            if (comanda == 2) {
////                System.out.println("введите адрес файла ");
////                getter.FileGetter();
////                deShifr.decryptorCaesar();
////                System.out.println("файл дешифрован, сохраните файл");
////            }
////            if (comanda == 3) {
////                System.out.println("введите адрес файла ");
////                getter.FileGetter();
////                bruteForse.HardBruteForse();
////                System.out.println("файл взломан, сохраните файл");
////
////            }
////            if (comanda == 4) {
////                System.out.println("введите адрес для сохранения файла");
////                getter.FileWriter();
////            }
////            if (comanda ==5){
////                System.out.println("Введите адрес файла для AES шифрования:");
////                String aesFileToEncrypt = scanner.nextLine();
////                byte[] fileContent = getter.readFileBytes(aesFileToEncrypt);
////                byte[] encryptedData = aesEncryptor.encrypt(fileContent);
////                getter.writeFileBytes("path/to/encrypted_file.txt", encryptedData);
////                System.out.println("Файл зашифрован AES, сохраните файл");
////            }
////        }
////    }
////}
//
//
