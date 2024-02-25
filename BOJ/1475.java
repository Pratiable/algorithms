import java.io.*;
import java.util.*;

public class Main {
    static int[] cards = new int[9];
    static int usedSets = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().trim();
        addSets();

        for (int i = 0; i < n.length(); i++) {
            int now = n.charAt(i) - '0';
            if (now == 9) now = 6;

            if (cards[now] == 0) {
                addSets();
            }

            cards[now] -= 1;
        }

        System.out.println(usedSets);
    }

    static void addSets() {
        for (int i = 0; i < 9; i++) {
            if (i == 6) {
                cards[i] += 2;
                continue;
            }
            cards[i] += 1;
        }
        usedSets += 1;
    }
}