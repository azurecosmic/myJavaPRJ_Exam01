import java.util.Scanner;

public class Array01_03 {
    public static void main(String[] args) {
        //학생 5명의 점수를 입력 받고 학생 점수 총 합과 평균을 구하여라.

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();

            sum += arr[i];
        }
        average = sum/a;
        System.out.println("총점은? : " + sum);
        System.out.println("평균점수는? : " + average);
    }
}