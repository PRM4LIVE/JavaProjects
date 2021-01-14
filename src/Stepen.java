import java.util.Arrays;

public class Stepen {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        int b = a[0];
        for (int num : a) {
            if (num < b) {
                b = num;
            }
        }
        String str = "Минимальное чсло в массиве: ";
        System.out.println(str + b);
        while (b != 1) {
            if (b % 3 == 0) b = b / 3;

            else {
                System.out.println("Не является степенью тройки!");
                break;
            }
        }
    }
}

