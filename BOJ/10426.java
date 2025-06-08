import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer date = new StringTokenizer(st.nextToken(), "-");
        int year = Integer.parseInt(date.nextToken());
        int month = Integer.parseInt(date.nextToken());
        int day = Integer.parseInt(date.nextToken());
        int count = Integer.parseInt(st.nextToken()) - 1;
        int[] last = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (true) {
            if (month == 2) {
                int lastDay = year % 4 == 0 && (year % 400 == 0 || year % 100 != 0) ? 29 : 28;
                if (day + count > lastDay) {
                    count -= lastDay - day + 1;
                    day = 1;
                    month++;
                } else {
                    day += count;
                    break;
                }
            } else {
                int lastDay = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ? 31 : 30;
                if (day + count > lastDay) {
                    count -= lastDay - day + 1;
                    day = 1;
                    if (month == 12) {
                        year++;
                        month = 1;
                    } else {
                        month++;
                    }
                } else {
                    day += count;
                    break;
                }
            }
        }

        System.out.printf("%d-%02d-%02d", year, month, day);
    }
}
