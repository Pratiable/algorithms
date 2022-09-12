import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>(Arrays.asList(br.readLine().split("")));
        List<String> a = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> b = new ArrayList<>(Arrays.asList("B", "A", "B", "C"));
        List<String> c = new ArrayList<>(Arrays.asList("C", "C", "A", "A", "B", "B"));
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            if (Objects.equals(a.get(i % 3), list.get(i))) {
                x++;
            }
            if (Objects.equals(b.get(i % 4), list.get(i))) {
                y++;
            }
            if (Objects.equals(c.get(i % 6), list.get(i))) {
                z++;
            }
        }

        int max = Math.max(Math.max(x, y), z);
        sb.append(max).append("\n");
        if (x == max) {
            sb.append("Adrian\n");
        }
        if (y == max) {
            sb.append("Bruno\n");
        }
        if (z == max) {
            sb.append("Goran\n");
        }

        bw.append(sb);
        bw.flush();
        bw.close();
    }
}