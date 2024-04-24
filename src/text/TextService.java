//package text;
//
//import aes.AesEncryptor;
//
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import java.io.*;
//import java.security.InvalidAlgorithmParameterException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.Scanner;
//
//public class TextService {
//        private final Scanner scanner;
//        public String text = "";
//        private byte[] fileContent;
//        private String filePath;
//
//        private AesEncryptor aesEncryptor;
//        private void writefile(byte[] encrypted) {
//        }
//
//
//        public TextService() throws InvalidAlgorithmParameterException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchPaddingException {
//                this.encryptorCaesar = new Alphabet.EncryptorCaesar(this);
//                this.aesEncryptor = new AesEncryptor();
//        }
//
//
//        private final Alphabet.EncryptorCaesar encryptorCaesar;
//
//        public void readFile() throws IOException {
//                this.filePath = scanner.nextLine();
//                File file = new File(filePath);
//                try (FileInputStream fis = new FileInputStream(file)) {
//                        this.fileContent = fis.readAllBytes();  // Чтение всех байт файла
//                } catch (FileNotFoundException e) {
//                        System.out.println(e.getMessage());
//                }
//
//        }
//
//        public void FileGetter() throws IOException {
//                getfile = scanner.nextLine();
//                File file = new File(getfile);
//                BufferedReader input = new BufferedReader(new FileReader(file));
//                while (input.ready()) {
//                        text = text + input.readLine();
//                }
//                input.close();
//
//                //return s;
//        }
//
//        public void FileWriter(byte[] data) throws IOException {
//                writefile = scanner.nextLine();
//                File file2 = new File(writefile);
//                file2.createNewFile();
//                try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file2))) {
//                        //outputStream.write(encryptorCaesar.encrypt());
//                        outputStream.write(data);
//                }
//        }
//
//        public void encryptFile() throws IOException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
//                if (this.fileContent == null) {
//                        System.out.println("Сначала нужно прочитать файл!");
//                        return;
//                }
//                byte[] encrypted = aesEncryptor.encrypt(this.fileContent);
//                writefile(encrypted);
//                System.out.println("Файл зашифрован и сохранен.");
//
//        }
//        public void decryptFile() throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
//                if (this.fileContent == null) {
//                        System.out.println("Сначала нужно прочитать файл!");
//                        return;
//                }
//                byte[] decrypted = aesEncryptor.decrypt(this.fileContent);  // Расшифровка файла
//                writeFile(decrypted);  // Сохранение расшифрованного содержимого
//                System.out.println("Файл расшифрован и сохранен.");
//        }
//
//        private void writeFile(byte[] decrypted) {
//        }
//
//
//        public String getGetfile () {
//                        this.getfile = getfile;
//                        return getfile;
//                }
//
//                public String getTextGetter () {
//                        return getTextGetter();
//                }
//                public char[] toCharArray () {
//                        return toCharArray();
//                }
//
//                public void FileWriter () {
//                }
//
//        public void writeFileBytes(String s, byte[] encryptedData) {
//        }
//
//        public byte[] readFileBytes(String aesFileToEncrypt) {
//                return aesFileToEncrypt.getBytes();
//        }
//}
//
