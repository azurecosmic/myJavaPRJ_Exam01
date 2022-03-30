import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("숫자를 입력하세요 : \n");
        a = s.nextInt();

        if (a % 15 == 0) {
       //if ((a%3 == 0) && (a%5 == 0)) {
            System.out.printf("3과 5의 배수입니다.");

        } else if (a % 3 == 0) {
            System.out.printf("3의 배수입니다.");

        } else if (a % 5 == 0) {
            System.out.printf("5의 배수입니다.");

        }
    }
}
