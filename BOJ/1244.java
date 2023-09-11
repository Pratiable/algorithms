import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] switches = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            switches[i] = st.nextToken().equals("1");
        }

        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            String sex = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (sex.equals("1")) {
                for (int j = 0; j < n; j++) {
                    if ((j + 1) % num == 0) {
                        switches[j] = !switches[j];
                    }
                }
            } else if (sex.equals("2")) {
                num -= 1;
                int l = num - 1;
                int r = num + 1;
                switches[num] = !switches[num];

                while (true) {
                    if (l < 0 || r >= n) break;
                    if (switches[l] != switches[r]) break;
                    switches[l] = !switches[l];
                    switches[r] = !switches[r];
                    l -= 1;
                    r += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(switches[i] ? "1 " : "0 ");
            if ((i + 1) % 20 == 0) sb.append("\n");
        }

        System.out.println(sb);
    }
}