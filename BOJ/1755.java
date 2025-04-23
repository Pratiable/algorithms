import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] numAlphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i < 100; i++) {
            if (i < 10) {
                map.put(numAlphabets[i], i);
            } else {
                map.put(String.format("%s %s", numAlphabets[i / 10], numAlphabets[i % 10]), i);
            }
        }

        for (int i = m; i <= n; i++) {
            if (i < 10) {
                list.add(numAlphabets[i]);
            } else {
                list.add(String.format("%s %s", numAlphabets[i / 10], numAlphabets[i % 10]));
            }
        }
        list.sort(Comparator.naturalOrder());

        for (int i = 1; i < list.size() + 1; i++) {
            sb.append(map.get(list.get(i - 1))).append(" ");
            if (i % 10 == 0) sb.append("\n");
        }

        System.out.println(sb);
    }
}