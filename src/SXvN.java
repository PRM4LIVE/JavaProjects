import java.util.Scanner;

public class SXvN {
    public static void main(String[] args) {
        System.out.println("Введите число:");
            Scanner name = new Scanner(System.in);

            int a = name.nextInt();
            int b = 0;

            while (a > 0) {
                b = b + a % 10;
                a = a / 10;

            }
        System.out.println("Сумма цифр числа: " +b);
        }
}
