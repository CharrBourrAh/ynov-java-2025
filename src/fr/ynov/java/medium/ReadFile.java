package fr.ynov.java.medium;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class ReadFile {
    public static String readFile(String filePath) {
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                return line;
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return "";
    }

    public static String[] filesInFolder(String folderPath) {
        File folder = new File(folderPath);
        return folder.list();
    }

    public static void readFilesInFolder(String folderPath) {
        for (int i = 0; i < filesInFolder(folderPath).length; i++) {
            readFile(folderPath + "/" + filesInFolder(folderPath)[i]);
        }
    }

    public static void createFolderAndFiles(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }
        for (int i = 0; i < 5; i++) {
            String s = "Hello World! " + i;
            byte[] data = s.getBytes();
            Path p = Paths.get(folderPath + "/textFile" + i + ".txt");

            try (OutputStream out = new BufferedOutputStream(
                    Files.newOutputStream(p, CREATE, APPEND))) {
                out.write(data, 0, data.length);
            } catch (IOException x) {
                System.err.println(x);
            }
        }
    }

    public static void main(String[] args) {
        readFile("test.txt");
        createFolderAndFiles("grr paw");
        readFilesInFolder("grr paw");
    }
}
