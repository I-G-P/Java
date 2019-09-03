package Condense_array_to_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        while (numbers.length!=1){
            int [] condensed = new int[numbers.length-1];
            for (int i = 0; i <condensed.length ; i++) {
                condensed[i] = numbers[i] + numbers[i+1];
            }
            numbers=condensed;
        }
        System.out.println(numbers[0]);


    }
}