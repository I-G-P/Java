package ZigZagArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagArrays {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfArrays = Integer.parseInt(reader.readLine());
        String[] firstArray = new String[numberOfArrays];
        String[] secondArray = new String[numberOfArrays];
        for (int i = 0; i < numberOfArrays; i++) {
            String[] curentArray = reader.readLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = curentArray[0];
                secondArray[i] = curentArray[1];
            } else {
                firstArray[i] = curentArray[1];
                secondArray[i] = curentArray[0];
            }
        }
        PrintArray(firstArray);
        PrintArray(secondArray);

    }

    public static void PrintArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
