import java.io.*;
import java.util.Scanner;

public class textGetter {

        static Scanner scanner= new Scanner(System.in);
        public static   String getfile;
        public static String writefile;

        public static  void FileGetter(){
            getfile=scanner.nextLine();
        }
        public static void FileWriter(){
            writefile=scanner.nextLine();
        }

        BufferedReader input =new BufferedReader(new FileReader(getfile));
        BufferedWriter output = new BufferedWriter(new FileWriter(writefile));

        public textGetter() throws IOException {
        }
}
