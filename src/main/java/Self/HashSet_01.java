package Self;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet <>();

        set.add("김구링");
        set.add("김규우린");
        set.add("김구린");
        set.add("김규린");

        int setSize = set.size();
        System.out.println("set에 저장한데이터의 크기" +setSize);

        System.out.println("for each문을사용해 set객체에 저장된 데이터 출력");
        for(String name : set ){
            System.out.println("이름: " + name);
        }
        System.out.println("람다식을 사용해 set객체에 저장된 데이터 출력");
        set.forEach(name -> System.out.println("name: "+ name));

        System.out.println("List에 저장했던 데이터를 Iterator 객체를통해 while문으로 출력");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println("이름: "+name);
        }
    }
}