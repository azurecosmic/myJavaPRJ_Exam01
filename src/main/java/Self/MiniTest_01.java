package Self;

public class MiniTest_01 {
    public int MiniTest_01 (int button) {
        System.out.println("아마스빈 알바생의 음료 만들기");
        System.out.println();
        System.out.println("1. 기계처럼 컵을 꺼낸다.");
        System.out.println("2. 선택한 펄을 계량한다.");

        switch (button) {
            case 1:
                System.out.println("3. 오레오쉐이크를 만든다.");
                break;

            case 2:
                System.out.println("3. 사하라를 만든다.");
                break;

            case 3:
                System.out.println("3. 타로밀크티를 만든다.");
                break;

            default:
                System.out.println("3. 내맘대로 아무거나 만든다.");
                break;
        }

        System.out.println("4. 얼음이나 토핑을 올린다.");
        System.out.println("5. 실링기에 실링한다.");

        return 0;
    }

}
