package School;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try{
            arr[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열의 크기보다 커요");
            System.out.println("에러메시지 : " + e);
        }
    }
}
