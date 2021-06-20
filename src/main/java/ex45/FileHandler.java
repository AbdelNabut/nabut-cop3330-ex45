package ex45;

import java.io.*;

public class FileHandler {

    private File file;

    public FileHandler(File file) {
        this.file = file;
    }

    public void replaceWords(String oldWord, String newWord, File newFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        BufferedReader reader = new BufferedReader(new FileReader(this.file));
        String newLine;
        String line = reader.readLine();
        while(line != null) {
            System.out.println(line);
            newLine = line.replaceAll(oldWord, newWord);
            writer.write(newLine + "\n");
            line = reader.readLine();
        }
        writer.close();
    }
}
