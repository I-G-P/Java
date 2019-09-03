package Print_numbers_in_reverse_order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(reader.readLine());
        int[] data = new int[numbers];

        for (int i = 0; i <numbers ; i++) {
            int curNum = Integer.parseInt(reader.readLine());
            data[i]= curNum;
        }
        for (int i = numbers-1; i >=0 ; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
