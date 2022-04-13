import java.util.Scanner;

public class Exam07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print("짝입니다.");
        } else {
            System.out.print("홀입니다.");
        }
    }
}
