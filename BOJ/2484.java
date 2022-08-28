import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>(4);
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            HashSet<Integer> set = new HashSet<>(list);

            if (set.size() == 1) {
                max = Math.max(max, 50000 + (a * 5000));
            } else if (set.size() == 2) {
                if (Collections.frequency(list, a) == 2) {
                    max = Math.max(max, 2000 + (Collections.max(set) * 500) + (Collections.min(set) * 500));
                } else if (Collections.frequency(list, a) == 3) {
                    max = Math.max(max, 10000 + (a * 1000));
                } else {
                    max = Math.max(max, 10000 + (b * 1000));
                }
            } else if (set.size() == 3) {
                for (int j = 0; j < 4; j++) {
                    if (Collections.frequency(list, list.get(j)) != 2){
                        continue;
                    }
                    max = Math.max(max, 1000 + list.get(j) * 100);
                }
            } else {
                max = Math.max(max, Collections.max(set) * 100);
            }
        }
        System.out.println(max);
    }
}