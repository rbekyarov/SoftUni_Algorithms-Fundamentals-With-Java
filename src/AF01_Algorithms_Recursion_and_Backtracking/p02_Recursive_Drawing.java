package AF01_Algorithms_Recursion_and_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_Recursive_Drawing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        printChars(num);
    }

    private static void printChars(int num) {
        if(num <= 0){
            return;
        }

        System.out.println(new String(new char[num]).replace("\0", "*"));
        printChars(num - 1);
        System.out.println(new String(new char[num]).replace("\0", "#"));
    }
}
