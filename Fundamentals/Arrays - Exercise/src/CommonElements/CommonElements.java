package CommonElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] fitstArrays = (reader.readLine().split(" "));
        String[] secondArrays = (reader.readLine().split(" "));

        for (int i = 0; i < secondArrays.length ; i++) {
            for (int j = 0; j <fitstArrays.length ; j++) {
                if(secondArrays[i].equals(fitstArrays[j])){
                    System.out.print(secondArrays[i]+" ");
                }
            }
        }
        System.out.println();
    }
}
