class DivisibilityChecker {

    static boolean divBy13(String s) {
        // Convert the string to an integer
        int num = Integer.parseInt(s);

        // Check if the number is divisible by 13
        return num % 13 == 0;
    }

    // Driver Code
    public static void main(String[] args) {
        String s = "2911285";

        boolean isDivisible = divBy13(s);

        if (isDivisible) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
