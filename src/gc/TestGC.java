package gc;

/**
 * Created by cong on 2018/4/2.
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 */
public class TestGC {

    private static final int _1MB = 1024 * 1024;

    public static void testAllocation(){
        byte[] allcation1, allcation2, allcation3, allcation4;

        allcation1 = new byte[2 * _1MB];
        allcation2 = new byte[2 * _1MB];
        allcation3 = new byte[2 * _1MB];
        allcation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        TestGC.testAllocation();
    }

}