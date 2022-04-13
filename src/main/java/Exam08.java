public class Exam08 {
    public static void main (String[] args) {
        int a = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                a = a + i;
            } else {
                a = a;
            }
        }
        System.out.print(a);
    }
}
