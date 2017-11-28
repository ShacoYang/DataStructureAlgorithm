package Sort;
/*
insertion sort use recursion
 */
public class _2Challenge {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 22, -5};
        // assuming the element position 0 is sorted

        insertionSort(intArray, intArray.length);
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }
        insertionSort(input, numItems -1);
        int newElement = input[numItems - 1];

        int i;
        // i > 0 because we haven't hit the front of the array
        // intArray[i - 1] the element is greater than the one we're trying to insert
        // if intArray[i - 1] > newElement, we still haven't find a correct position
        // when we hit the 0 means this one is the smallest one
        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

        System.out.println("result of call when numItems =" + numItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
}
