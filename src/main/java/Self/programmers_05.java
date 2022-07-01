package Self;

import java.util.Scanner;

public class programmers_05 {
    public static void main(String [] args) {
        programmers_05 p5=new programmers_05();
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        p5.solution(num);

    }
    public String solution(int num) {
        return (num%2==0)? "Even":"Odd";

    }

}