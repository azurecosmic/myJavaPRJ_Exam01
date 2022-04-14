import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //줄을 찍고
        int a = s.nextInt(); //외부조건
        int b = a;
        int c = a/2-1;
        int d = 1;

        for (int i = 1; i < a; i++) {
            System.out.println(i);
            for ( int j = 0; j < d + 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                System.out.println();
                b++;
            }






        }
    }
}