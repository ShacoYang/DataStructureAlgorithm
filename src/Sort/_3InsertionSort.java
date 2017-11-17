package Sort;

public class _3InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 22, -5};
        // assuming the element position 0 is sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++){
            // save the value of element into a newElement (overwritten)
            int newElement = intArray[firstUnsortedIndex];

            int i;
            // i > 0 because we haven't hit the front of the array
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
