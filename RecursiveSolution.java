public class RecursiveSolution {
    
    // return to sum of all non-negative integers up to n
    public int tri(int n) {
        // base case
        if (n <= 0) return 0;
        // add the previous number until 0
        return n + tri(n - 1);
    }

    // factorial
    public int fact(int n) {
        // base case
        if (n == 1) return 1;
        // time the previous number until 1
        return n * fact(n - 1);
    }

    // fibonacci
    public int fib(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        else if (n == 0) {
            return 0;
        }
        // sum the previous two number to get the nth place
        return fib(n - 1) + fib(n - 2);
    }

    // string reverser
    public String reverseStr(String str) {
        // base case if string is empty
        if (str.length() == 0) return "";
        // keep adding the character of index 0 at the end
        return reverseStr(str.substring(1)) + str.charAt(0);
        
    }

    public static void main(String[] args) {
        RecursiveSolution ex = new RecursiveSolution();
        System.out.println(ex.tri(6));
        System.out.println(ex.fact(5));
        System.out.println(ex.fib(3));
        System.out.println(ex.reverseStr("apple"));
    }
}
