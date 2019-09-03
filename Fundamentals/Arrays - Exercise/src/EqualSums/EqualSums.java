package EqualSums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int leftSum = 0;
        int position = -1;
        for (int i = 0; i < numbers.length; i++) {
            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                position = i;
                break;
            } else {
                leftSum += numbers[i];
            }
        }
        if (position >= 0) {
            System.out.println(position);
        } else {
            System.out.println("no");
        }
    }
}
