package School;

import java.util.Scanner;

public class Class_01 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sum01 sum001 = new Sum01();

        System.out.println(sum001.sum(1,2));

    }

    class Sum01{

        public int sum (int num1, int num2){
            return num1 + num2;
        }

    }

}
