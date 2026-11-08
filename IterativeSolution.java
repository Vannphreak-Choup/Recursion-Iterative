public class IterativeSolution {

    // return the sum of all non-negative integers up to n
    // O(n)
    public int tri(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    // factorial
    // O(n)
    public int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // fibonacii
    // O(n)
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

    // string reverser
    // O(n)
    public String reverseStr(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // hasChar: take string and char return true if the char exist in the string else false
    // O(n)
    public boolean hasChar(String str, char c) {
    	for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    // GCD: greatest common divisor
	// O(logn)
    public int gcd(int x1, int x2) {
        while (x2 != 0) {
        	int temp = x2;
        	x2 = x1 % x2;
        	x1 = temp;
        }
        // return the last non-zero remainder
        return x1;
    }

    // count the unique path
    // O(m * m) or O(n^2)
    public int countUniquePaths(int n, int m) {
    	// empty grid no path
    	if (n == 0 || m == 0) return 0;
		// paths[i][j] = ways to reach this cell
    	int[][] paths = new int[n][m];

		// left column 1 way and top column 1 way
    	for (int i = 0; i < n; i++) {
    		paths[i][0] = 1;
    	}
    	for (int j = 0; j < m; j++) {
    		paths[0][j] = 1;
    	}

    	for (int i = 1; i < n; i++) {
    		for (int j = 1; j < m; j++) {
    			// above + left
    			paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
    		}
    	}
		// bottom right = total path
    	return paths[n - 1][m - 1];
    }

}
