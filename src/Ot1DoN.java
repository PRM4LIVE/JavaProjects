import java.util.Scanner;

public class Ot1DoN {
    public static void main(String[] args) {
        System.out.println("Считаем сумму чисел от 1 до N:");
        Scanner name = new Scanner(System.in);
        int a = name.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
