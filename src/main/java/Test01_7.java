import java.util.Scanner;

public class Test01_7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        /*시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램*/
        if (90 <= a && a <= 100) {
            System.out.print("A");
        } else if (80 <= a && a <= 89) {
            System.out.print("B");
        } else if (70 <= a && a <= 79) {
            System.out.print("C");
        } else if (60 <= a && a <= 69) {
            System.out.print("D");
        } else {
            System.out.print("F");

        }

    }
}