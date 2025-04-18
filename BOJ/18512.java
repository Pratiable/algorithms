import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int min = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = p1; i < 100_001; i += x) {
            set.add(i);
        }

        for (int i = p2; i < 100_001; i += y) {
            if (set.contains(i)) {
                min = i;
                break;
            }
        }

        System.out.println(min);
    }
}