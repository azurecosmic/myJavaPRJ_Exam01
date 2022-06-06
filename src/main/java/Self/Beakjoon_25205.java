package Self;

import java.util.Scanner;

public class Beakjoon_25205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        /*System.out.println(" str.length() : "+str.length());*/
        String lst = str.substring(n-1);
        //대신 chatAt

        if (lst.equals("r")){
            System.out.println(1);
        } else if (lst.equals("s")){
            System.out.println(1);
        } else if (lst.equals("e")){
            System.out.println(1);
        } else if (lst.equals("f")){
            System.out.println(1);
        } else if (lst.equals("a")){
            System.out.println(1);
        } else if (lst.equals("q")){
            System.out.println(1);
        } else if (lst.equals("t")){
            System.out.println(1);
        } else if (lst.equals("d")){
            System.out.println(1);
        } else if (lst.equals("w")){
            System.out.println(1);
        } else if (lst.equals("c")){
            System.out.println(1);
        } else if (lst.equals("z")){
            System.out.println(1);
        } else if (lst.equals("x")){
            System.out.println(1);
        } else if (lst.equals("v")){
            System.out.println(1);
        } else if (lst.equals("g")){
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}
