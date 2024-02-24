import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> map = new HashMap<>();
        map.put("Paper", 57.99);
        map.put("Printer", 120.50);
        map.put("Planners", 31.25);
        map.put("Binders", 22.50);
        map.put("Calendar", 10.95);
        map.put("Notebooks", 11.20);
        map.put("Ink", 66.95);
        double sum = 0;

        while (true) {
            String now = br.readLine();
            if (Objects.equals(now, "EOI")) break;

            sum += map.get(now);
        }

        System.out.printf("$%.2f", sum);
    }
}
