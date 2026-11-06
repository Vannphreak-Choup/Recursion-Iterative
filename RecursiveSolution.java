public class RecursiveSolution {
    
    // return to sum of all non-negative integers up to n
    public int tri(int n) {
        // base case
        if (n <= 0) return 0;
        
        return n + tri(n - 1);
    }

    public static void main(String[] args) {
        RecursiveSolution ex = new RecursiveSolution();
        System.out.println(ex.tri(6));
    }
}
