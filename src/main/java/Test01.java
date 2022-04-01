import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // a b 가 주어지고
        // ab를 비교
        //크면 > 작으면 < 같으면 ==을 출력
        Scanner s  = new Scanner(System.in);

        int i = s.nextInt();
        int j = s.nextInt();

        if (i < j) {
            System.out.println("<");
        } else if (i == j) {
            System.out.println("==");
        } else {
            System.out.println(">");
        }
    }
}