import java.util.Scanner;

public class Doska {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        if (a%4==0 || a == 1) System.out.println("yes");
        else System.out.println("no");


    }
}
