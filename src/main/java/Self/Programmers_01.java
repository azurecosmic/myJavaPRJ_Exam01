package Self;

public class Programmers_01 {

        public static void main(String[] args) {
            Pro_nse p = new Pro_nse();

            String str = "2three45sixseven";

            p.solution(str);
        }

        public int solution(String str) {

            int answer = 0;


            str = str.replace("zero","0");

            str = str.replace("one","1");

            str = str.replace("two","2");

            str = str.replace("three","3");

            str = str.replace("four","4");

            str = str.replace("five","5");

            str = str.replace("six","6");

            str = str.replace("seven","7");

            str = str.replace("eight","8");

            str = str.replace("nine","9");


            answer += Integer.parseInt(str);
            System.out.println(answer);
            return answer;
        }

    }
}
