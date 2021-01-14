import java.io.*;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String path = scanner.nextLine();

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str!=null){
                System.out.println(str);
                str = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");

        }
        catch (IOException e) {
            System.out.println("Не возможно открыть файл");
        }
    }
}
