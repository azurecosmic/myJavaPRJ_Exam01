package Self;

import java.util.Scanner;

public class Beakjoon_2577 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a*b*c;    //세 수 곱하기
        int n = 0;
        int temp = mul;

        while (temp != 0){  //멈추는 조건 걸어주기(?)
            n++;
            temp /= 10;
        }

        int[] arr = new int[n];   //쪼갠 숫자 담을 배열 만들어주기
        temp = mul;

        for (int i = arr.length-1; i >= 0; i--){    //숫자 쪼개기
            arr[i] = temp % 10;
            temp /= 10;
        }
        /*for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/

        int[] cnt = new int[10];

        /*for (int j = 0; )*/



    }
}
