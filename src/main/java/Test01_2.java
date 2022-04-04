import java.util.Scanner;

public class Test01_2 {
    public static void main(String[] args) {
        /*
        윤년이면 1, 아니면 0
        연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        */

        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        if ((i%4 == 0 && i%100 != 0) || i%400 == 0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }


    }
}