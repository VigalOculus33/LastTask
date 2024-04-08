import jdk.internal.classfile.impl.AbstractPoolEntry;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню");
        System.out.println("выберите действие");
        System.out.println("1 зашифровать файл");
        System.out.println("2 расшифровать файл");
        System.out.println("3 взломать файл");
        System.out.println("4 сохранить файл");

        while (true) {

            int comanda = scanner.nextInt();


            if (comanda == 1) {
                System.out.println("введите адрес файла ");
                textGetter.FileGetter();

                System.out.println("файл зашифрован, сохраните файл");

            }

            if (comanda == 2) {
                System.out.println("введите адрес файла ");
                textGetter.FileGetter();

                System.out.println("файл дешифрован, сохраните файл");
            }
            if (comanda == 3) {
                System.out.println("введите адрес файла ");
                textGetter.FileGetter();

                System.out.println("файл взломан, сохраните файл");

            }
            if (comanda == 4) {
                System.out.println("введите адрес для сохранения файла");
                textGetter.FileWriter();
            }
        }
    }
}