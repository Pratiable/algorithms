import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int ills = Integer.parseInt(st.nextToken());
            String s = "";
            for (int i = 0; i < ills; i++) {
                int ill = Integer.parseInt(st.nextToken());
                if (map.containsKey(ill)) {
                    s += map.get(ill) + " ";
                } else {
                    s = "YOU DIED";
                    break;
                }
            }

            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}