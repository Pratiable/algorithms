import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num;
            switch (cmd) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    s.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    s.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(s.contains(num) ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (s.contains(num)) {
                        s.remove(num);
                        break;
                    }
                    s.add(num);
                    break;
                case "all":
                    s.clear();
                    for (int j = 1; j < 21; j++) {
                        s.add(j);
                    }
                    break;
                case "empty":
                    s.clear();
                    break;
            }
        }

        System.out.println(sb);
    }
}
