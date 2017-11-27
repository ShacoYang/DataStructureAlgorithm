package Sort;

public class _7QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 22, -5};

        quickSort(intArray, 0, intArray.length);

        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        //pivot (position of the element in the sorted array)
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // first pivot start
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //empty loop body
            //right - left looking for smaller elements
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            //left - right looking for larger element
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
