import java.io.*;
import java.util.StringTokenizer;

public class Test06_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        StringTokenizer st;

        for(;;) {
            st = (new StringTokenizer(br.readLine(), " "));
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            if (i == 0 && j == 0){
                break;
            } else {
                bw.write((i+j) + "\n");
            }

        }
        br.close();

        bw.flush();
        bw.close();
    }
}
