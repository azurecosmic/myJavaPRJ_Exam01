import java.util.Scanner;

public class Test05_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int cnt = 0;

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
            }

            cnt += 1;

        }
        System.out.println(max);
        System.out.print(cnt);
    }
}