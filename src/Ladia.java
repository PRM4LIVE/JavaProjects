import java.util.Scanner;

public class Ladia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы узнать бьёт ли ладья другую фигуру за один ход ");
        System.out.println("введите координаты ладьи (два числа от 1 -8): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите координаты другой фигуры (два числа от 1 до 8):1");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a == c || b == d) System.out.println("YES");
        else System.out.println("NO");
    }
}
