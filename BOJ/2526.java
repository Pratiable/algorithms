import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int cur = n;

        while (!map.containsKey(cur)) {
            map.put(cur, count);
            count++;
            cur = (cur * n) % p;
        }

        System.out.println(count - map.get(cur));
    }
}

