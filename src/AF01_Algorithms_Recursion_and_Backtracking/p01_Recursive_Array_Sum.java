package AF01_Algorithms_Recursion_and_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p01_Recursive_Array_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = sum(integers, 0);

        System.out.println(sum);

    }

    private static int  sum(List<Integer> integers, int index) {

        if(index >= integers.size()){
            return 0 ;
        }

        return integers.get(index)  +   sum(integers, index +1);
    }
}
