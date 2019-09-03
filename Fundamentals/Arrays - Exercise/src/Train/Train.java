package Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numverOfWagons = Integer.parseInt(reader.readLine());
        int counter = 0;
        int[] train = new int[numverOfWagons];
        while (counter < numverOfWagons) {
            int peoples = Integer.parseInt(reader.readLine());
            train[counter] = peoples;
            counter++;
        }
        int sum = 0;
        for (int peopleInWagon : train) {
            System.out.print(peopleInWagon + " ");
            sum+=peopleInWagon;
        }
        System.out.println();
        System.out.println(sum);
    }
}
