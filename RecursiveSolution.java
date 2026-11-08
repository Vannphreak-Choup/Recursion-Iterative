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

    // hasChar: take a string and char and return true if the char exist in the string else false
    public boolean hasChar(String str, char c) {
    	// base case if the string is empty
    	if (str.length() == 0) {
    		return false;
    	}
    	// if the first character is the match
    	else if (str.charAt(0) == c) {
    		return true;
    	}
    	// keep checking the next character of the string
    	return hasChar(str.substring(1), c);	
    }

    // GCD: greatest common divisor
    public int gcd(int x1, int x2) {
    	// base case 
    	if (x2 == 0) return x1;
    	return gcd(x2, x1 % x2);
    }

    // count the unique path
    public int countUniquePaths(int n, int m) {
    	// base case empty grid no path and if single row or column, 1 way
    	if (n == 0 || m == 0) {
    		return 0;
    	}
    	else if (n == 1 || m == 1) {
    		return 1;
    	}
    	// (n - 1, m) = cell above, (n, m - 1) = cell to the left
    	return countUniquePaths(n - 1, m) + countUniquePaths(n, m - 1);
    }

    public static void main(String[] args) {
        RecursiveSolution ex = new RecursiveSolution();
        System.out.println(ex.tri(6));
        System.out.println(ex.fact(5));
        System.out.println(ex.fib(3));
        System.out.println(ex.reverseStr("apple"));
        System.out.println(ex.hasChar("apple", 'c'));
        System.out.println(ex.gcd(18, 48));
        System.out.println(ex.countUniquePaths(3, 3));
    }
}
