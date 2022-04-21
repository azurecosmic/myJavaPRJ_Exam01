import java.util.Scanner;

public class Test05_01 {
    public static void main(String[] args) {
        /*첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            } else if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.print(min + " " + max);
    }
}
