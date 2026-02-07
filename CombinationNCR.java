class CombinationNCR {

    // Function to calculate nCr
    static int nCr(int n, int r) {

        // No valid combinations if r > n
        if (r > n)
            return 0;

        // Base cases
        if (r == 0 || r == n)
            return 1;

        // Recursive case: include or exclude
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    // Main method (Driver Code)
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println("nCr value is: " + nCr(n, r));
    }
}
