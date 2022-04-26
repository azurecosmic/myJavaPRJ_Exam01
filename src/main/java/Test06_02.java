/*import java.util.Scanner;*/

public class Test06_02 {
    public static void main(String[] args) {
        /*
         * 스캐너로 변수 입력 받아서 만드세요! -->   홀수 5이상 부터 가능
         * */

        for (int a = 0; a < 7; a++) {
            if (a == 3) {
                for (int b = 0; b < a; b++) {

                    for (int c = 0; c <= b; c++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            } else if (a == 4) {
                for (int b = a; b > 0; b--) {
                    for (int c = 1; c <= b; c++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}