package T;

/**
 * Created by sunlei on 23/02/2018.
 */
public class main {
    public static <T extends Family<? super T>> void test(T t){
        System.out.println(t.hello(t));
    }
    public static void main(String[] args){
        Family father=new Father();
        test(father);
        Child child=new Child();
        test(child);
    }
}
