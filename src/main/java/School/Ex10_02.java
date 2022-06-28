package School;

public class Ex10_02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try{
            arr[2] = 100/0;
            arr[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 큽니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류입니다.");
        } finally {
            System.out.println("이부분은 무조건 나옵니다.");
        }
    }
}
