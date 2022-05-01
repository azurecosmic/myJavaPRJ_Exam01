import java.util.ArrayList;
import java.util.List;

public class Arraylist_03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("김규린");
        list.add("가나다");
        list.add("둘리");
        list.add("뽀로로");
        list.add("타요");

        int listSize = list.size();

        //foreach문으로 조회 / while문과 유사하게 데이터 수만큼 자동 반복
        for (String name : list) {
            System.out.println("이름 : "+ name);
        }

    }
}
