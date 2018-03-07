import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

//    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "1111");
//        map.put(2, "2222");
//        map.put(3, "3333");
//        map.put(4, "4444");
//        map.put(5, "5555");
//        Set<Integer> set = map.keySet();
//        for (Integer i : set) {
//            System.out.println(map.get(i));
//        }
//        System.out.println(map);
//
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
    static Date getBefore() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);    //得到前一天
        Date date = calendar.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(date));
        return df.parse(df.format(date));
    }

    public static void main(String[] args) {
        try {
            System.out.println(getBefore());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
