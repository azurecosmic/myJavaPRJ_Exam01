import java.util.Scanner;

public class Ex05_09 {
    public static void main(String[] args) {
        /*switch 뒤에 괄호 속 기호의 값이 case의 값과 일치할때만 실행이 된다.
        break를 꼭 걸어야한다. 걸지않으면 print값이 전부 출력된다.*/

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("1~4 중에 선택하세요 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.printf("1을 선택했다\n");
                break;

            case 2:
                System.out.printf("2를 선택했다\n");
                break;

            case 3:
                System.out.printf("3을 선택했다\n");
                break;

            case 4:
                System.out.printf("4를 선택했다\n");
                break;

            default:
                System.out.printf("이상한걸 선택했다.\n");
                break;


        }

    }
}
