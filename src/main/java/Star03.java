import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = a;
        int c = 1;

        for (int i = a; 0 < i; i--) {
            for (int j = 1; j < b; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b++;
        }
    }
}
