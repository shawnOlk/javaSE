package graph;

/**
 * Created by sunlei on 26/02/2018.
 */
public class Graph {
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
}
