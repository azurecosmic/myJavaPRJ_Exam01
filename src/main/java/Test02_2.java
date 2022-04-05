import java.util.Scanner;

public class Test02_2 {
    public static void main(String[] args) {
    /*첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)*/

        Scanner s = new Scanner(System.in);
        int c = s.nextInt();


        for (int d = 1; d <= c; d++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);

        }

    }
}
