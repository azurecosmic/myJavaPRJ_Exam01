public class Ex07_02 {
    public static void main(String[] args) {
        int a = 0;
        int i = 1;

        while ( i < 11) {
            a += i;
            i++;
        }

        System.out.printf("1에서 10까지의 합은 %d", a);
    }
}
