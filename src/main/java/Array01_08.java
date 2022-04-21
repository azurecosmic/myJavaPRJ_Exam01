public class Array01_08 {
    public static void main(String[] args) {

        int[] arr = {1,1,3,4,5,5,4,3,4};
        int[] result = new int [9]; //9말고 array.length로 해도됨

        for (int i = 0; i < arr.length; i++) {
            result[arr[i]]++;
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(i + "의 개수는? : " + result[i]);
        }

    }
}