package sort;

/**
 * Created by sunlei on 23/02/2018.
 */
public class Main {
    public static void main(String[] arg) {

        int[] array = {2, 3, 0, 8, 1, 6, 5, 7, 4, 9, 10, 9};
//        System.out.println(SearchUtils.binarySearch(array,7));
        SortUtils.heapSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
