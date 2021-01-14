import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner name = new Scanner(System.in);
        int a = name.nextInt();
        int b = 1;
        for (int i = 2; i <= a; i++) {
            b = b * i;

        }
        System.out.println("Факториал заданного числа: "+b);
    }
}
//1*2=2*3=6*4=24*5=120*6=720*7=5040*8=40320*9=362880*10=3628800
// 1   2   3    4     5     6      7       8        9