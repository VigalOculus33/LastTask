import java.io.*;
import java.util.Scanner;

public class textGetter {

        static Scanner scanner= new Scanner(System.in);
        public static   String getfile;
        public static String writefile;

        public static void FileGetter() throws IOException {
                getfile=scanner.nextLine();
                File file = new File(getfile);
                BufferedReader input =new BufferedReader(new FileReader(file));
                input.close();

                //return getfile;
        }
        public static void FileWriter() throws IOException {
                writefile = scanner.nextLine();
                File file2 = new File(writefile);
                file2.createNewFile();
                try (BufferedWriter output = new BufferedWriter(new FileWriter(file2))) {
                        output.write("text");
                }
        }
}
