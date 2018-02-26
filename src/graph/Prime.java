package graph;

/**
 * Created by sunlei on 26/02/2018.
 */
public class Prime {
    public static int[][] initArray(int length) {
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {

            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    array[i][j] = -1;
                } else {
                    int temp = (int) (Math.random() * 200 + 1);
                    array[i][j] = temp;
                }
                array[j][i] = array[i][j];
            }
        }
        return array;
    }

    /**
     * lowcast存档各个联通各个节点的最短权重
     * 首先由两个集合 visted中为1 已经遍历的节点， visted为0 未遍历的节点
     * 每次从lowcast中找到未遍历且最小的节点，然后将visted的该节点标记为1，更新该节点到其他为遍历节点的最小权重到lowcast
     * @param array
     * @param length
     */

    public static void primeDo(int[][] array, int length) {
        int[] lowcast = new int[length];
        int[] visted = new int[length];
        visted[0] = 1;
        int cast = 0;
        for (int i = 0; i < length; i++) {
            lowcast[i] = array[0][i];
        }
        System.out.println("0--->");
        for (int i = 0; i < length; i++) {

            int k = 0;
            int min = 65535;
            for (int j = 0; j < length; j++) {
                if (visted[j] == 0 && lowcast[j]<100 && min > lowcast[j]) {
                    min = lowcast[j];
                    k = j;
                }
            }
            visted[k] = -1;
            if (k != 0)
                System.out.println(k + "--->");
            for (int j = 0; j < length; j++) {
                if (visted[j] == 0 && lowcast[j] > array[k][j]) {
                    lowcast[j] = array[k][j];
                }
            }
        }

    }
}
