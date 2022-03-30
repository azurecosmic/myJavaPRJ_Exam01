import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("숫자를 입력하세요 : \n");
        a = s.nextInt();

        if (a%2 == 1) {
            System.out.printf("홀입니다.");
        } else {
            System.out.printf("짝입니다.");
        }
    }
}
