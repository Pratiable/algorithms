import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        double planA = a > 100 ? 25 * (a - 100) / 100.0 + 15 * b / 100.0 + 20 * c / 100.0 : 15 * b / 100.0 + 20 * c / 100.0;
        double planB = a > 250 ? 45 * (a - 250) / 100.0 + 35 * b / 100.0 + 25 * c / 100.0 : 35 * b / 100.0 + 25 * c / 100.0;

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Plan A costs %.2f\n", planA));
        sb.append(String.format("Plan B costs %.2f\n", planB));

        if (planA < planB) {
            sb.append("Plan A is cheapest.");
        } else if (planA > planB) {
            sb.append("Plan B is cheapest.");
        } else {
            sb.append("Plan A and B are the same price.");
        }

        System.out.println(sb);
    }
}
