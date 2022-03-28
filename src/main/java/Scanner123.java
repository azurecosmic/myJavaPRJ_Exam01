import java.util.Scanner;

public class Scanner123 {
    //워크스페이스 => 작업공간

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = "김규린";
        System.out.print("이름 입력 : ");
        String inputName = in.nextLine();
        if (name.equals(inputName)) {
            System.out.print("몇단 : ");
            int num = in.nextInt();
            int num2 = 0;
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2);
        } else {
            System.out.println("로그인 실패");
        }


    }
}
