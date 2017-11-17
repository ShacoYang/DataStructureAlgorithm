package Sort;

/*
find the index of the largest element in every traversal and put it 2 the end
 */
public class _2Selection {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 22, -5};

        for (int lastUnsorted = intArray.length - 1; lastUnsorted > 0; lastUnsorted--){
            int indexOfLargest = 0;
            // update indexOfLarget
            for (int i =1; i <= lastUnsorted; i++){
                if (intArray[indexOfLargest] < intArray[i]) {
                    indexOfLargest = i;
                }
            }
            //swap largest value and lastUnsorted
            swap(intArray, indexOfLargest, lastUnsorted);
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
