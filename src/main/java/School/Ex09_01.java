package School;

public class Ex09_01 {
    public static void main(String[] args) {
        String str = "IT CookBook. Java";
        int len;

        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d", len);

        if (str.length() > 0){
            System.out.println("str변수에 값이 존재한다.");
        } else{
            System.out.println("str변수에 값이 존재하지 않는다.");
        }
    }
}
