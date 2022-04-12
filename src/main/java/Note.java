import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //줄을 찍고
        int a = s.nextInt(); //외부조건
        int b = (2*a);

        for (int i = 1; i <= (2*a)-1; i++) {

            for(int j = 1; j <= b-1; j++){
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b--;

        }

    }
}