import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;
        import java.util.StringTokenizer;

public class Test04_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력받음
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 입력받음 값을 출력
        StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 공백기준으로 문자를 자름
        StringBuilder sb = new StringBuilder(); // 하나의 문자열로 변환
        int N = Integer.parseInt(st.nextToken()); // 입력받은 문자열을 쪼개서 출력, for문 어디까지 돌릴껀지
        int x = Integer.parseInt(st.nextToken()); // 입력받은 문자열을 쪼개서출력, 비교값
        int i; // for문
        int s; // 입력받은 문자를 자름
        st = new StringTokenizer(bf.readLine(), " ");
        for(i = 0; i < N; i++) {
            s = Integer.parseInt(st.nextToken());
            if(s < x) sb.append(s).append(' '); //s가x보다 작으면 s를 공백과 함께 출력
        }
        bw.write(sb+"");
        bf.close();
        bw.flush();
        bw.close();

    }

}
