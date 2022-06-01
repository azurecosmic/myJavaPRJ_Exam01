package Self;

import java.util.Scanner;

public class MiniTest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amasvin;
        int ret;

        System.out.println("손님! 어떤 음료 드릴까요? (1. 오레오쉐이크 2. 사하라 3. 타로밀크티)");
        amasvin = sc.nextInt();

        MiniTest_01 cm = new MiniTest_01();
        cm.MiniTest_01(amasvin);

        System.out.println("주문하신 음료 드릴게요~!");
        System.out.println("음료에 빨대 꽂아드릴까요?");
    }
}
