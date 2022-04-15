public class Array01_01 {
    public static void main(String[] args) {
        int[] score = new int[3];

        score[0] = 100;
        score[1] = 200;
        score[2] = 300;

        System.out.println(score); //값이 I@77ec8df 로 출력되는데, I는 배열의 데이터타입, @뒤는 실제 메모리 주소를 나타냄.
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length); //배열의 길이를 나타냄.
    }
}