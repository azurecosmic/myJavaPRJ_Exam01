import java.util.Scanner;

public class Test02_1 {
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);

         int a = s.nextInt();


         for (int b = 1; b <= 9; b++) {
             System.out.println(a + "*" + b + "=" + (a*b));
         }


    }
}