import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            boolean[] visited = new boolean[10000];
            String result = "0".repeat(10000);

            Queue<Make> q = new LinkedList<>();
            q.add(new Make(n, ""));
            visited[n] = true;

            while (!q.isEmpty()) {
                Make now = q.poll();

                if (result.length() < now.cmd.length()) continue;
                if (now.num == m) {
                    result = now.cmd;
                    continue;
                }

                int d = now.num % 10;
                int c = (now.num % 100 - d) / 10;
                int b = (now.num % 1000 - (c * 10 + d)) / 100;
                int a = (now.num % 10000 - (b * 100 + c * 10 + d)) / 1000;

                int D = now.num * 2 % 10000;
                if (!visited[D]) {
                    visited[D] = true;
                    q.add(new Make(D, now.cmd + "D"));
                }

                int S = now.num == 0 ? 9999 : now.num - 1;
                if (!visited[S]) {
                    visited[S] = true;
                    q.add(new Make(S, now.cmd + "S"));
                }

                int L = b * 1000 + c * 100 + d * 10 + a;
                if (!visited[L]) {
                    visited[L] = true;
                    q.add(new Make(L, now.cmd + "L"));
                }

                int R = d * 1000 + a * 100 + b * 10 + c;
                if (!visited[R]) {
                    visited[R] = true;
                    q.add(new Make(R, now.cmd + "R"));
                }
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    static class Make {
        int num;
        String cmd;

        Make(int num, String cmd) {
            this.num = num;
            this.cmd = cmd;
        }
    }
}