public class IterativeSolution {

    // return the sum of all non-negative integers up to n
    public int tri(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    // factorial
    public int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // fibonacii
    public int fib(int n) {
        // check for 0 position
        if (n == 0) {
            return 0;
        }

        // store prev as the starting from 0 and current is the next number which is 1
        int prev = 0;
        int current = 1;
        // repeat until we reach the nth position
        for (int i = 1; i < n; i++) {
            // calculate the next fibonacci number
            int next = prev + current;
            // move current number into previous
            prev = current;
            // move next number into current
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        IterativeSolution ex = new IterativeSolution();
        System.out.println(ex.tri(6));
        System.out.println(ex.fact(5));
        System.out.println(ex.fib(5));
    }
}
