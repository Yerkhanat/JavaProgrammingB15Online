package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Path.of("src/Hero.txt"));
        System.out.println(allLines);

    }
}
