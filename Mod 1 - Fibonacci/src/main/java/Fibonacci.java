public class Fibonacci {

    /**
     * Returns the nth term in the Fibonacci sequence using recursion.
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int term = 10;

        int answer = fibonacci(term);

        System.out.println("Midterm Proofing Update: The " + term
                + "th term of the Fibonacci sequence is "
                + answer + ".");
    }
}