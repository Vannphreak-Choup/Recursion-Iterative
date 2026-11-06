public class IterativeSolution {

    // return the sum of all non-negative integers up to n
    public int tri(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        IterativeSolution ex = new IterativeSolution();
        System.out.println(ex.tri(6));
    }
}
