package finalTest;

/**
 * Created by sunlei on 22/02/2018.
 */
public class main {
    public static void main(String[] args) {
        final int[] aa = {1, 2, 3};
        int[] bb={4,5,6};
        System.out.println(aa[1]);
        aa[1]=3;
        System.out.println(aa[1]);
        System.out.println(bb.toString());

    }
}
