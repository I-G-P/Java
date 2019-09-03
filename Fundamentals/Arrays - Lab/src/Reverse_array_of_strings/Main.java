package Reverse_array_of_strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        for (int i = input.length-1; i >=0 ; i--) {
            System.out.print(input[i]+" ");
        }
    }
}
