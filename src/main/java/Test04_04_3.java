public class Test04_04_3 {
    public static void main(String[] args) {
        //문자열을 더해주는 함수
        //list와 함꼐 사용하면 좋음

        StringBuilder sb = new StringBuilder("hello ");
        sb.append("world").append("1").append(" ").append("2");

        System.out.println(sb);
    }
}