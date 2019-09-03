package ArrayRotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = reader.readLine().split(" ");
        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            String[] currentArray = new String[array.length];
            for (int j = 0; j < array.length; j++) {

                if (j == 0) {
                   currentArray[array.length-1]= array[j];
                }else{
                    currentArray[j-1]= array[j];
                }
            }
            array=currentArray;
        }
        PrintArray(array);
    }
    public static void PrintArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
