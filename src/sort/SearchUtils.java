package sort;

/**
 * Created by sunlei on 23/02/2018.
 */
public class SearchUtils {
    /**
     * 二分查找，返回下标，如果没找到，返回-1
     * array 从小到大排序
     *
     * @param array
     * @param num
     * @return
     */
    public static int binarySearch(int[] array, int num) {
        if (array == null) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            //排除start+end可能越界的可能 无符号右移
            int mid = (start + end) >>> 1;
            if (num == array[mid]) {
                return mid;

            } else if (num < array[mid]) {
                end = mid - 1;

            } else if (num > array[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
