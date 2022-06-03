package School;

import java.util.Scanner;

public class Ex07_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("더할 첫 번째수 입력 : ");
            int a = sc.nextInt();
            System.out.printf("더할 두 번째수 입력 : ");
            int b = sc.nextInt();

            if (a==0) {
                break;
            }

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
        System.out.printf("0을 입력해서 반복문을 탈출했습니다. \n");
    }
}
