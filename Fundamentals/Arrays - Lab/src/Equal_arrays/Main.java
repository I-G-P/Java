package Equal_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        int index = 0;
        boolean areIdentical = true;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] == secondArray[i]) {
                    sum += firstArray[i];
                } else {
                    index = i;
                    areIdentical = false;
                    break;
                }
            }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        }
    }
}
