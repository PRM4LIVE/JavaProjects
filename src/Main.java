import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < 10; i++) {
            a[i] = a[i - 1] +a[i - 2];

        }
        System.out.print(Arrays.toString(a));

    }
}
