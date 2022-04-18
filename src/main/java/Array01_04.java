public class Array01_04 {
    public static void main(String[] args) {

        int[] score = {26,20,44,54,30,40,98,37};

        int min = score[0];
        int max = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값은 : " + max);
        System.out.println("최솟값은 : " + min);
    }
}