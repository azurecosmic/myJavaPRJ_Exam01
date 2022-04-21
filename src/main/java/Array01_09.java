public class Array01_09 {
    public static void main(String[] args) {
        //함수를 이용한 빈도수 구하는 방법/ 특정 인덱스에 위치하는 유니코드 단일문자를 반환
        String a,b,c;
        int[] arr = new int[15];
        a = "12345";
        b = "54321";
        c = "456678";

        String result = a+b+c;
        System.out.println(result);

        for(int i = 0; i < arr.length; i++) {
            arr[result.charAt(i) - '0'] ++; //정수형을 int로 변환이 어렵지만 정수형끼리의 뺼셈을 할 경우 컴퓨터가 유니코드로 변환해
            //연산을 하기때문에 유니코드 끼리의 차이값을 이용해 숫자값을 뽑아냄.
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}