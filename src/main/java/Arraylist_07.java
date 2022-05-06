public class Arraylist_07 {
    public static void main(String[] args) {
        //2중반복문, 엑셀과 비슷한 2차원배열
        //2차원배열로 구구단 찍기

        int[][] arr = new int[10][10];

        for(int i = 2; i < arr.length; i++) {
            /*if (i == 8) {
                break;
            }*/
            if (i%2 == 0) {
                if (i == 8){
                    break;
                }
                System.out.println("<" + i + "단>");
            }

            for (int j = 1; j < arr.length; j++) {

                arr[i][j] = i*j;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}