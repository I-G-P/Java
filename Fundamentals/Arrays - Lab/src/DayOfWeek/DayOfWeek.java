package DayOfWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayNumber = Integer.parseInt(reader.readLine());
        String result = "Invalid day!";
        if (dayNumber >= 1 && dayNumber <= 7) {
            result = dayOfWeek[dayNumber - 1];
        }
        System.out.println(result);
    }
}
