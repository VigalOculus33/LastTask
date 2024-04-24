package file;

import java.util.Scanner;

public class PathService {

    private final Scanner scanner;

    public PathService(Scanner scanner) {
        this.scanner = scanner;
    }

    public CustomPath readPath() {
        System.out.println("Введите путь для чтения файла: ");
        var path = new CustomPath();
        path.setInputPath(scanner.nextLine());
        return path;
    }

    public CustomPath writePath() {
        System.out.println("Введите путь для записи файла: ");
        var path = new CustomPath();
        path.setOutputPath(scanner.nextLine());
        return path;
    }

}
