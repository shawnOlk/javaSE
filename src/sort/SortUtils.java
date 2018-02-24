package sort;

/**
 * Created by sunlei on 23/02/2018.
 */
public class SortUtils {

    public static void bubbleSort(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }


    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 归并排序
     * 递归的方式将数组分为两份，分别排序
     * 最后调用merge方法排序将这两个排序好的数组排序
     *
     * @param array
     * @param start
     * @param end
     */
    public static void mergeSort(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        if (start != end) {
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, end);
        }

    }

    /**
     * merge方法以mid为界，【start，mid】和【mid+1，end】的数据都是已经排序好的，只需要将两个排序好的数组合并排序
     *
     * @param array
     * @param start
     * @param end
     */
    private static void merge(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;
        int m = 0;
        int[] tmp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                tmp[m++] = array[i];
                i++;
            } else {
                tmp[m++] = array[j];
                j++;
            }
        }
        for (; i <= mid; i++) {
            tmp[m++] = array[i];
        }
        for (; j <= end; j++) {
            tmp[m++] = array[j];
        }
        m = 0;
        for (int t = start; t <= end; t++, m++) {
            array[t] = tmp[m];
        }
    }

    /**
     * 快速排序法，找到一个基准，index左边的都比array[index] 小，右边都大
     *
     * @param array
     * @param start
     * @param end
     */
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int index = partition(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array, index + 1, end);
        }
    }


    /**
     * 找到一个基准点，从左开始遍历如果大于tmp，则与index交换，
     * 然后从右向左遍历找到小于tmp的再与index交换，
     * 这样保证每次循环都会使的index左边的数都小于tmp，右边的都大于tmp
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] array, int start, int end) {
        int tmp = array[end];//本例以最后一个数字作为基准
        int index = end;
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && array[i] <= tmp) {
                i++;
            }
            if (i < j) {
                array[index] = array[i];
                array[i] = tmp;
                index = i;
            }
            while (i < j && array[j] >= tmp) {
                j--;
            }
            if (i < j) {
                array[index] = array[j];
                array[j] = tmp;
                index = j;
            }

        }

        return index;
    }

    /**
     * 从小到大排序
     * 大顶堆
     * 首先构造一个大顶堆，保证最大的值在下标为0的地方
     * 将构造好的大顶堆与最后一个数字交换，在调整大顶堆，如此循环
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapAdjust(array, i, length);
        }
        length--;
        while (length > 0) {
            swap(array, 0, length);
            length--;
            heapAdjust(array, 0, length);
        }

    }

    private static void heapAdjust(int[] array, int index, int end) {
        int max = array[index];
        for (int k = index * 2 + 1; k < end; k = 2 * k + 1) {
            if (k + 1 < end && array[k + 1] > array[k]) {
                k++;
            }
            if (array[k] >= max) {
                swap(array, k, index);
                index = k;
            } else {
                break;
            }

        }

    }
}
