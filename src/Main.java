import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1111");
        map.put(2, "2222");
        map.put(3, "3333");
        map.put(4, "4444");
        map.put(5, "5555");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(map.get(i));
        }
        System.out.println(map);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
