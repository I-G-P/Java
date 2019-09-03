package MaxSequenceOfEqualElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = reader.readLine().split(" ");
        int position = 0;
        int numOfSequence = 1;
        for (int i = 0; i < array.length; i++) {
            int currentNumOfSequence = 1;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    currentNumOfSequence++;
                    if (j == array.length - 1 && currentNumOfSequence > numOfSequence) {
                        numOfSequence = currentNumOfSequence;
                        position = i;
                    }

                } else {
                    if (currentNumOfSequence > numOfSequence) {
                        numOfSequence = currentNumOfSequence;
                        position = i;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < numOfSequence; i++) {
            System.out.print(array[position + i] + " ");
        }
        System.out.println();
    }
}
