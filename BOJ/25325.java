import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] names = br.readLine().split(" ");
        Map<String, Integer> pop = new HashMap<>();

        for (String name : names) {
            pop.put(name, 0);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String name = st.nextToken();
                pop.put(name, pop.get(name) + 1);
            }
        }

        Arrays.sort(names, (o1, o2) -> {
            int a = pop.get(o1);
            int b = pop.get(o2);

            return a != b ? b - a : o1.compareTo(o2);
        });

        for (String name : names) {
            sb.append(name).append(" ").append(pop.get(name)).append("\n");
        }

        System.out.print(sb);
    }
}
