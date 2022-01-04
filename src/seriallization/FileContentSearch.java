/*package seriallization;

import java.io.*;
import java.util.Scanner;


public class FileContentSearch {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (path.exists() || path.isFile()) {
            System.out.println("Path does not exist or is directory");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            findFile(path, keyword);
        }
    }

    private static void findFile(File path, String keyword) throws FileNotFoundException {
        for (File file : path.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, keyword);
            } else {
                if (file.getName().endsWith("txt")) {
                    searchKeyword(file, keyword);
                }
            }

        }

    }

    private static <line> void searchKeyword(File file, String keyword) throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)) {
            String line = "";
            while((line=bufferedReader.readLine())!=null)

            {

                if (line.contains(keyword)) {

                    System.out.println(file.getAbsolutePath());

                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();

        }
    }

}
        */
