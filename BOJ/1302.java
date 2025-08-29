import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String cur = br.readLine();

            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }

        String[] books = map.keySet().toArray(new String[0]);
        Arrays.sort(books);
        int max = 0;
        String best = "";

        for (String book: books) {
            int cur = map.get(book);

            if (cur > max) {
                max = cur;
                best = book;
            }
        }

        System.out.println(best);
    }
}