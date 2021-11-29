package AF01_Algorithms_Recursion_and_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p07_Recursive_Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int fibonacci = getFibonacci(n);

        System.out.println(fibonacci);
    }

    private static int getFibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
