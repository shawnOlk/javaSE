package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by sunlei on 2018/3/10.
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c=Class.forName("T.Child");

       Constructor constructor= c.getConstructor();
        Object o= constructor.newInstance();
        System.out.println(o);


    }
}
