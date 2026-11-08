public class RecursiveSolution {
    
    // return to sum of all non-negative integers up to n
    // O(n)
    public int tri(int n) {
        // base case
        if (n <= 0) return 0;
        // add the previous number until 0
        return n + tri(n - 1);
    }

    // factorial
    // O(n)
    public int fact(int n) {
        // base case
        if (n == 1 || n == 0) return 1;
        // time the previous number until 1
        return n * fact(n - 1);
    }

    // fibonacci
    // O(2^n) with normal return fib(n - 1) + fib(n - 2) 
    // with helper method (optimized) O(n)
    public int fib(int n) {
        // a = fib(0) and b = fib(1) 
   		return fibhelper(n, 0, 1);
    }

    // carries the two previous fibonacci numbers so nothing is calculated twice
    private int fibhelper(int n, int a, int b) {
    	// base case after n step (a) holds the nth number 
    	if (n == 0) return a;
    	// move forward one step: the old b becomes a, and the new b is the sum
    	return fibhelper(n - 1, b, a + b);
    }

    // string reverser
    // O(n)
    public String reverseStr(String str) {
        StringBuilder result = new StringBuilder();
        reverseStrHelper(str, str.length() - 1, result);
        return result.toString();
        
    }

    // append the characters from the last index down to 0
    private void reverseStrHelper(String str, int index, StringBuilder result) {
    	// base case: we pass the start of the string
    	if (index < 0) {
    		return;
    	}
    	result.append(str.charAt(index));
    	reverseStrHelper(str, index - 1, result);
    }

    // hasChar: take a string and char and return true if the char exist in the string else false
    // O(n)
    public boolean hasChar(String str, char c) {
    	return hasCharHelper(str, c, 0);
    }

    // checks character at index then moves on to the next one
    private boolean hasCharHelper(String str, char c, int index) {
    	// base case if reach the end can't find it
    	if (index >= str.length()) return false;

    	// base case if match
    	if (str.charAt(index) == c) return true;

    	// keep checking the next character
    	return hasCharHelper(str, c, index + 1);
    }

    // GCD: greatest common divisor
    // O(logn)
    public int gcd(int x1, int x2) {
    	// base case 
    	if (x2 == 0) return x1;
    	return gcd(x2, x1 % x2);
    }

    // count the unique path
    // O(n * m) or O(n^2)
    public int countUniquePaths(int n, int m) {
    	// base case empty grid no path
    	if (n == 0 || m == 0) return 0;

		int[][] memo = new int[n + 1][m + 1];
    	return paths(n, m, memo);
    }

    private int paths(int n, int m, int[][] memo) {
    	// base case: a single row or column has exactly 1 way
    	if (n == 1 || m == 1) return 1;

		// already calculated so reuse it
    	if (memo[n][m] != 0) return memo[n][m];

    	// (n - 1, m) = cell above and (n, m - 1) = cell to the left
    	memo[n][m] = paths(n - 1, m, memo) + paths(n, m - 1, memo);
    	return memo[n][m];
    }

}
