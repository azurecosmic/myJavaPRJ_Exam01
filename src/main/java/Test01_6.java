import java.util.Scanner;

public class Test01_6 {
    public static void main(String[] args) {
       /* 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.*/
        Scanner s = new Scanner (System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a == b && a == c){
            System.out.print(10000 + (a*1000));
        } else if (a == b || a == c ){
            System.out.print(1000 + (a*100));
        } else if (b == c){
            System.out.print(1000 + (b*100));
        } else if ((a != b) && (a != c) && (b != c)){
            if ((a >= b) && (a >= c)){
                System.out.print(a*100);
            } else if ((b >= a) && (b >= c)){
                System.out.print(b*100);
            } else if ((c >= a) && (c >= b)){
                System.out.print(c*100);
            }
        }

    }
}
