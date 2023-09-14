import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<Document> queue = new LinkedList<>();
            int[] priority = new int[10];
            int max = 0;

            for (int i = 0; i < n; i++) {
                Document now = new Document(i, Integer.parseInt(st.nextToken()));
                max = Math.max(max, now.prio);
                priority[now.prio]++;
                queue.add(now);
            }

            int cnt = 1;

            while (!queue.isEmpty()) {
                Document now = queue.poll();
                if (now.prio == max) {
                    if (now.idx == m) break;
                    cnt++;

                    if (--priority[now.prio] == 0) {
                        for (int i = max; i > 0; i--) {
                            if (priority[i] != 0) {
                                max = i;
                                break;
                            }
                        }
                    }

                    continue;
                }

                queue.add(now);
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    static class Document {
        int idx, prio;

        public Document(int idx, int prio) {
            this.idx = idx;
            this.prio = prio;
        }
    }
}