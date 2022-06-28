package Self;

import java.util.Scanner;

public class Beak_1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int N = sc.nextInt();
        int n = N;

        while (true)/*여기에 조건식 넣어서 풀어보기*/{

            int a = n/10;
            int b = n%10;
            int c = a+b;  //(n/10)+(n%10);
            /*int d = c/10; 필요없음*/
            int e = c%10;
            int f = (b*10)+e;

            cnt += 1;

            if (N == f){
                System.out.println(cnt);
                break;
            }

            n = f;
        }


    }
}