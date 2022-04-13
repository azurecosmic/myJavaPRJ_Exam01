import java.util.Scanner;

public class Ex07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("더할 첫 번째 수 입력 : ");
            int a = sc.nextInt();
            System.out.printf("더할 두 번째 수 입력 : ");
            int b = sc.nextInt();

            System.out.println( a + "+" + b + "=" + (a + b));
        }
    }
}
