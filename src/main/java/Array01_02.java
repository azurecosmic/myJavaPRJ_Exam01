public class Array01_02 {
    public static void main(String[] args) {
        //배열을 복사하는 방법

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] copy = new int[arr.length*2]; //arr값의 2배를 해서 공간이 6으로 늘어남.
        System.out.println(copy.length);

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];

            System.out.println(copy[i]);
        }
        arr = copy;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); //남은 456 빈 공간에 동일한 데이터타입(int)말고 다른 기본형 변수를 사용할 수 있음.파이썬이랑 비슷
        }
    }
}