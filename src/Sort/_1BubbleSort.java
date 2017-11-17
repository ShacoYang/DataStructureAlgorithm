package Sort;
/*
worst case
n^2 steps n = number of items
 */
public class _1BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 22, -5};

        for (int lastUnsorted = intArray.length -1 ; lastUnsorted > 0; lastUnsorted--){
            for (int j = 0; j < lastUnsorted; j++){
                if (intArray[j] > intArray[j+1]){
                    swap(intArray, j, j + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
