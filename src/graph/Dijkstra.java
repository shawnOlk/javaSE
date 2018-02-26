package graph;

/**
 * Created by sunlei on 26/02/2018.
 */
public class Dijkstra extends Graph {

    public static void doDijkstra(int[][] array, int length) {
        int[] dist = new int[length];//到每个节点最短的长度
        int[] visted = new int[length];
        visted[0] = 1;
        for (int i = 1; i < length; i++) {
            dist[i] = array[0][i];
        }
        for (int i = 1; i < length; i++) {
            int min = 65536;
            int k = 0;
            for (int j = 1; j < length; j++) {
                if (visted[j] == 0 && min > dist[j]) {
                    min = dist[j];
                    k = j;
                }
            }

            for (int j = 1; j < length; j++) {
                if (visted[j] == 1 && min > dist[j] + array[j][k]) {
                    min = dist[j] + array[j][k];

                }

            }
            visted[k] = 1;
            dist[k] = min;
        }

        for(int i=0;i<length;i++){
            System.out.println("i:"+i+"dist: "+dist[i]);
        }
    }

}
