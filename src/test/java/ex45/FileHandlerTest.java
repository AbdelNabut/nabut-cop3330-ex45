package ex45;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void replaceWords() throws IOException {
        String oldWord = "utilize";
        String newWord = "use";
        File testOutput = new File("src/test/java/ex45/test_output.txt");
        File expectedOutput = new File("src/test/java/ex45/expected_output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(testOutput));
        BufferedReader reader = new BufferedReader(new FileReader(expectedOutput));
        String newLine;
        String line = reader.readLine();
        while(line != null) {
            System.out.println(line);
            newLine = line.replaceAll(oldWord, newWord);
            writer.write(newLine + "\n");
            line = reader.readLine();
        }
        writer.close();
        assertEquals(true, FileUtils.contentEquals(expectedOutput, testOutput));
    }
}