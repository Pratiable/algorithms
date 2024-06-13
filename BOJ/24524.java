import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static String target;
    static HashMap<Character, Queue<Integer>> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        target = br.readLine();
        map = new HashMap<>();

        for (int i = 97; i <= 122; i++) {
            map.put((char) i, new LinkedList<>());
        }

        for (int i = 0; i < str.length(); i++) {
            map.get(str.charAt(i)).add(i);
        }

        count = 0;

        Queue<Integer> queue = new LinkedList<>();
        while (!map.get(target.charAt(0)).isEmpty()) {
            queue.add(map.get(target.charAt(0)).poll());
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            dfs(0, now);
        }

        System.out.println(count);
    }

    static void dfs(int depth, int idx) {
        if (depth == target.length() - 1) {
            count++;
            return;
        }
        char next = target.charAt(depth + 1);

        while (true) {
            if (map.get(next).isEmpty()) return;
            int nextIdx = map.get(next).poll();
            if (nextIdx < idx) continue;
            dfs(depth + 1, nextIdx);
            break;
        }
    }
}
