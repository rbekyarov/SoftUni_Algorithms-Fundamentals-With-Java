package AF01_Algorithms_Recursion_and_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p03_Generating_Vectors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int[] vector = new int[num];

        generateVectors(vector, 0);
    }

    private static void generateVectors(int[] vector, int index) {
        if (index >= vector.length) {
            List<String> before = Arrays.stream(vector)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.toList());

            System.out.println(String.join("", before));
            return;
        }

        for (int i = 0; i <= 1; i++) {
            vector[index] = i;
            generateVectors(vector, index + 1);
        }
    }
}
