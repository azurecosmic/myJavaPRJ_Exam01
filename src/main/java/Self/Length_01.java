package Self;

import java.util.Scanner;

public class Length_01 {
    public static void main(String[] args) {

        /*String str = "IT CookBook. Java";
        int len;

        len = str.length();

        System.out.println("문자열 : "+str);
        System.out.println("문자열 길이 : "+len);*/

        /*Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 => ");
        str = sc.nextLine();

        System.out.print("출력 문자열 => ");

        if (!str.startsWith("(")){
            System.out.printf("(");
        }
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
        if (!str.startsWith(")")){
            System.out.printf(")");
        }*/

        /*String str = "Java studying. Java is fun. ^^";

        System.out.println("문자열 => " + str);

        System.out.print("제일 처음 나오는 Java의 위치 => ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막으로 나오는 Java의 위치 => ");
        System.out.println(str.lastIndexOf("Java"));*/

        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ","$");
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 => " + str);
        System.out.println("바꾼 문자열 => " + strRep);
        System.out.println("일부 문자열 => " + strSub);

        for (int i = 0; i < strAry.length; i++){

        }
    }
}
