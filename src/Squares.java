import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int max = keybd.nextInt();
        System.out.println("Number       Square\n_________    _________");
        for (int i = 1; max >= i; i++ ) {
            System.out.println(i + "            " + i * i);
        }

    }
}
