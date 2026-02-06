import java.util.*;

class PrimeSieve {

    // Method to find all prime numbers up to n
    static List<Integer> sieve(int n) {

        // Create boolean array to mark prime numbers
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        // 0 and 1 are not prime
        prime[0] = prime[1] = false;

        // Apply Sieve of Eratosthenes
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // Mark multiples of p as non-prime
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Store prime numbers in a list
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                result.add(i);
            }
        }

        return result;
    }

    // Main method (Driver code)
    public static void main(String[] args) {
        int n = 35;

        List<Integer> primes = sieve(n);

        // Print result
        for (int p : primes) {
            System.out.print(p + " ");
        }
    }
}
