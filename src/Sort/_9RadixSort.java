package Sort;

public class _9RadixSort {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i ]);
        }
    }
    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix) {
        int numIterms = input.length;
        //0 - 9 radix: 10
        int[] countArray = new int[radix];
        //how many values have a certain digit in whatever position
        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        //adjust count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numIterms];
        for (int tempIndex = numIterms - 1; tempIndex >= 0; tempIndex--) {
             temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                     input[tempIndex];
        }
        //copy back
        for (int tempIndex = 0; tempIndex < numIterms; tempIndex++ ) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
