package graph;

/**
 * Created by sunlei on 26/02/2018.
 */
public class Main {
    public static void main(String[] args) {
        int length=4;
        int[][] a = Prime.initArray(length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        Prime.primeDo(a,length);
    }
}
