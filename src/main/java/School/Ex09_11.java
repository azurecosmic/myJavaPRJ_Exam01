package School;

import java.util.Scanner;

public class Ex09_11 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.println("손님! 어떤 음료 드릴까요? (1. 오레오쉐이크 2. 사하라 3. 타로밀크티)");
        coffee = sc.nextInt();

        CoffeeMachine cm = new CoffeeMachine();
        cm.coffee_machine(coffee);

        /*ret = coffee_machine(coffee);

        if (ret == 0) {
            System.out.println("함수 실행 성공");
        }*/

        System.out.println("주문하신 음료 드릴게요~!");
        System.out.println("음료에 빨대 꽂아드릴까요?");
    }



}
