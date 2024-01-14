import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int get = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a >= b) {
                get++;
                continue;
            }

            list.add(b - a);
        }

        if (get >= k) {
            System.out.println(0);
            return;
        }

        Collections.sort(list);

        System.out.println(list.get((k - get) - 1));
    }
}
