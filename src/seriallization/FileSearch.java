package seriallization;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileSearch {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            File file = new File("new file.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println("every think is ok realy?!");
            pw.println("hello world");
            pw.println("hello java");
            pw.close();
            br = new BufferedReader(new FileReader("new file.txt"));
            Boolean line;
            while (line = br.readLine() != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally{

                try {
                    br.close();

                } catch (IOException e) {
                    System.out.println("Error:" + e);
                }
            }
        }
    }

        
