import java.util.Scanner;

public class Summa_chisel_chisla {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        int a = name.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
