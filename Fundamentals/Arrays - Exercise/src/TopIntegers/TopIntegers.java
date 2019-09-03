package TopIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] elements = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                System.out.print(elements[i]);
            } else {
                int bigestElelment= elements[i] ;
                boolean is = true;
                for (int j = i + 1; j < elements.length; j++) {
                    if (elements[i] <= elements[j]) {
                        is=false;
                        break;
                    }
                }
                if(is){
                    System.out.print(bigestElelment+" ");
                }
            }
        }
    }
}
