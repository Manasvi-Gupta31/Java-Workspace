// For printing one .txt file output without deleting old content

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite_30 {

    public static void main(String[] args) {

        try {
            // -------- Writing into sample.txt (APPEND MODE) --------
            FileWriter fw = new FileWriter("sample.txt", true); // true = append
            fw.write("\nJava I/O Streams Example");
            fw.close();

            System.out.println("Content added successfully.\n");

            // -------- Reading from sample.txt --------
            FileReader fr = new FileReader("sample.txt");
            int i;

            System.out.println("File content:");

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
