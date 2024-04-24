package text;

import file.PathService;

import java.io.*;

public class CustomTextService {

    private final PathService pathService;

    public CustomTextService(PathService pathService) {
        this.pathService = pathService;
    }

    public CustomText readText() throws IOException {
        var path = pathService.readPath();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path.getInputPath()))) {
            var bytesArray = inputStream.readAllBytes();
            return new CustomText(new String(bytesArray));
        }
    }

    public void writeText(CustomText text) throws IOException {
        var path = pathService.writePath();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path.getOutputPath()))) {
            outputStream.write(text.getText().getBytes());
        }
    }
}
