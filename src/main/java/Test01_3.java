import java.util.Scanner;

public class Test01_3 {
    public static void main(String[] args) {
        /*첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0)
        다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)*/

        Scanner s = new Scanner (System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        if (x !=0 && y!=0){

            if (x>0 && y>0){
                System.out.print("1");
            } else if (x>0 && y<0){
                System.out.print("4");
            } else if (x<0 && y>0){
                System.out.print("2");
            } else if (x<0 && y<0){
                System.out.print("3");
            }
        }
    }
}