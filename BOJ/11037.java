import java.io.*;
import java.util.*;

public class Main {
    static boolean[] used;

    static ArrayList<Integer> arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        arr = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            used = new boolean[10];
            f(i, 0, 0);
        }

        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            if (n > 987_654_321) {
                sb.append(0).append("\n");
                continue;
            }

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > n) {
                    sb.append(arr.get(i)).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }

    static void f(int digit, int idx, int num) {
        if (idx == digit) {
            arr.add(num);
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (used[i]) continue;
            used[i] = true;
            f(digit, idx + 1, num * 10 + i);
            used[i] = false;
        }
    }
}