import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.printf(" 몇단? ");
        int a = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d \n", a, i, a*i);
        }
    }
}
