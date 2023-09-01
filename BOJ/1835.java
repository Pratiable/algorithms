import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int idx = 0;
        String[] cards = new String[n];

        Arrays.fill(cards, "");

        for (int i = 1; i < n + 1; i++) {
            int cnt = i + 1;
            while (true) {
                if (Objects.equals(cards[idx], "")) cnt--;
                if (cnt == 0) {
                    cards[idx] = String.valueOf(i);
                    break;
                }
                idx++;
                if (idx >= n) idx = 0;
            }
        }

        System.out.println(String.join(" ", cards));
    }
}

