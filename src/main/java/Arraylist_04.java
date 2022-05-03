import java.util.ArrayList;
import java.util.List;

public class Arraylist_04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //List 객체에 데이터 추가하기
        list.add("김규린");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        list.add("둘리");
        list.add("루피");

        //List의 데이터 수 구하기
        int listSize = list.size();

        //List 객체에 저장된 값 출력하기
        //여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        //일반적인 for문
        for (int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }


    }
}