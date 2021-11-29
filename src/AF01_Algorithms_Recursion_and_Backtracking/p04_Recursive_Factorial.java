package AF01_Algorithms_Recursion_and_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_Recursive_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        int factorial = factorial(num, 1);

        System.out.println(factorial);
    }

    private static int factorial(int num, int index) {
        if (index >= num) {
            return num;
        }

        return index * factorial(num, index + 1);
    }
}
