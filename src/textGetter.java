import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class textGetter {
        static Scanner scanner= new Scanner(System.in);
        private String getfile;
        public String writefile;
        public String text = "";

        public textGetter() throws InvalidAlgorithmParameterException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchPaddingException {
                this.encryptorCaesar = new EncryptorCaesar(this);
        }

        private final EncryptorCaesar encryptorCaesar;
        public void FileGetter() throws IOException {
                getfile=scanner.nextLine();
                File file = new File(getfile);
                BufferedReader input =new BufferedReader(new FileReader(file));
                while (input.ready()){
                       text = text + input.readLine();
                }
                input.close();

                //return s;
        }



        public void FileWriter() throws IOException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
                writefile = scanner.nextLine();
                File file2 = new File(writefile);
                file2.createNewFile();
                try (BufferedWriter output = new BufferedWriter(new FileWriter(file2))) {
                        output.write(encryptorCaesar.encrypt());
                }
        }
        public String getGetfile() {
                this.getfile =getfile;
                return getfile;
        }

        public String getTextGetter(){return getTextGetter()
                ;}
        public char[] toCharArray() {
                return toCharArray();
        }
}
