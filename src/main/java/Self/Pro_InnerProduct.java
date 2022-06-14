package Self;

public class Pro_InnerProduct {
    public static void main(String[] args) {
        Pro_InnerProduct p = new Pro_InnerProduct();
        int [] a = {1,2,3,4};
        int [] b = {-3,-1,0,2};
        p.solution(a,b);

        System.out.println(p.solution(a,b));
    }

    public int solution(int[] a, int[] b) {

        int answer = 0;

        for (int i = 0; i < a.length; i++){
            int inner = a[i] * b[i];
            answer += inner;
        }

        return answer;
    }
}