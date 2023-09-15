import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(br.readLine());
        }

        Collections.sort(a);

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : a) {
            map.put(name, 1);
        }



        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                map.put(name, 2);
            }
        }

        for (String name : a) {
            if (map.get(name) == 2) {
                sb.append(name).append("\n");
                sum++;
            }
        }

        System.out.println(sum);
        System.out.println(sb);
    }
}