import java.util.Scanner;

public class Test02_3 {
    public static void main(String[] args) {
        /*n이 주어졌을 때, 1부터 n까지 합*/
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int hap = 0;

        for (int c = 1; c <= a; c++){

            hap += c;

        }
        System.out.println(hap);

    }
}