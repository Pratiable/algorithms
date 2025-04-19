import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Report> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if (cmd == 0) {
                if (!stack.empty()) {
                    Report now = stack.pop();
                    now.time -= 1;
                    if (now.time == 0) {
                        sum += now.score;
                    } else {
                        stack.add(now);
                    }
                }
                continue;
            }

            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken()) - 1;

            if (time == 0) {
                sum += score;
                continue;
            }

            stack.add(new Report(score, time));
        }

        System.out.println(sum);
    }

    static class Report {
        int score, time;

        public Report(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }
}