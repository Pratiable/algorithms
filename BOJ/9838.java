import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] people = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }

        int[] gift = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            gift[people[i]] = i;
        }

        for (int i = 1; i <= n; i++) {
            sb.append(gift[i]).append("\n");
        }

        System.out.println(sb);
    }
}