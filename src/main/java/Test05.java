import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int h = c / 60;
        int m = c % 60;
        a = a + h;
        b = b + m;

        if (b >= 60) {
            a++;
            if (a > 24) {
                System.out.print((a - 24) + " " + (b - 60));
            } else if (a == 24) {
                System.out.print(0 + " " + (b - 60));
            } else if (a < 24) {
                System.out.print(a + " " + (b - 60));
            }
        } else if (b < 60) {
            if (a > 24) {
                System.out.print((a - 24) + " " + b);
            } else if (a == 24) {
                System.out.print(0 + " " + b);
            } else if (a < 24) {
                System.out.print(a + " " + b);
            }
        }


    }
}