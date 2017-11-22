package Sort;

public class _5Recursion {
    public static void main(String[] args) {
        System.out.println(recursionFactorial(4));
    }

    // 1! = 1 * 0!
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // n! = n * (n -1)!
    public static int recursionFactorial(int num) {
        if (num ==0 || num ==1){
            return 1;
        }
        return num* recursionFactorial(num -1);
    }
    public static int interativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
