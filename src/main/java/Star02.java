import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //줄을 찍고
        int a = s.nextInt(); //외부조건
        int b = a;

        for (int i = 0; i < a; i++) {
            for ( int j = 0; j < b; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b--;
        }
    }
}