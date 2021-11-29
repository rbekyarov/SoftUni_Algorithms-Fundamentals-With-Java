package AF02_Permutations_Combinations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_1_Permutations_without_Repetitions {
    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        elements = reader.readLine().split("\\s+");
        permutes = new String[elements.length];
        used = new boolean[elements.length];

        permute(0);
    }

    private static void permute(int index) {
        if (index == elements.length) {
            print();
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                permutes[index] = elements[i];
                used[i] = true;
                permute(index + 1);
                used[i] = false;
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", permutes));
    }
}
