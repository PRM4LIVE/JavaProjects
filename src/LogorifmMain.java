import java.util.Scanner;

public class LogorifmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание: ");
        int a = scanner.nextInt();
        System.out.println("Введите аргумент: ");
        int x = scanner.nextInt();
        int b = 0;
        int c = 0;
        while (b != 1) {
            b = x / a;
            x = b;
            c = c + 1;
            System.out.println("Делим Аргументн на " + "Основание" + " получаем число: " + b);


        }
            System.out.println("Логарифм = "+ c);

    }
}
//log2(a) 4(x) = 2(b) ; 4 / 2 =2 /2 1 = 2