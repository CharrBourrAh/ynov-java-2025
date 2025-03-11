package fr.ynov.java.medium;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class WriteFile {
    public static void main(String[] args) {
        writeFile("test\\text2.txt", "test\\text99.txt");
    }
    public static void writeFile(String filename1, String filename2) {
        byte[] data = ReadFile.readFile(filename1).getBytes();
        Path p = Paths.get(filename2);

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
            FileOutputStream.nullOutputStream().close();
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
