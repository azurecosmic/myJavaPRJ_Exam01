import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);


        int h = s.nextInt();
        int m = s.nextInt();

        if (m < 45){
            if (h == 0){
                h = 23;
                System.out.println(h+" "+(m+15));
            } else if (1 <= h && h <= 24){
                h--;

                System.out.println(h+" "+(m+15));
            }
        } else {
            System.out.println(h+" "+(m-45));
        }

    }
}
