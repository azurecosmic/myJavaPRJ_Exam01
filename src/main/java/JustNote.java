public class JustNote {
    public static void main(String[] args) {
        /*50~100까지의 수를 3,7,13의 배수는 제외하고 곱합값을 출력하라*/

        int b = 0;
        for (int i= 50; i < 101; i++){
            if ( (i % 3 != 0) && (i % 7 != 0) && (i % 13 != 0) ){
                b = b + i;
            }
        }
        System.out.println(b);
    }
}
