package School;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {
        //연산 속도의 차이

        List<String> list = new ArrayList<>();

        list.add("둘리");
        list.add("도우너");
        list.add("희동이");
        list.add("마이콜");
        list.add("고길동");
        list.add("깐따삐야");

        int listSize = list.size();

        for(int i = 0; i < listSize; i++){
            System.out.println("일반 for문 이름: "+list.get(i));
        }

        for (String name : list){
            System.out.println("foreach문 이름: " + name);
        }

        list.forEach(name -> System.out.println("람다식 name : " + name));

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("와일 이름: " + name);
        }
    }
}
