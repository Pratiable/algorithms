import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Number> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            if (now == 0 && !pq.isEmpty()) {
                sb.append(pq.poll().num).append("\n");
                continue;
            } else if (now == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
                continue;
            }

            pq.offer(new Number(now));
        }

        System.out.println(sb);
    }

    static class Number implements Comparable<Number> {
        int num;

        Number (int num) {
            this.num = num;
        }

        @Override
        public int compareTo(Number number) {
            if (Math.abs(this.num) > Math.abs(number.num)) {
                return 1;
            } else if (Math.abs(this.num) < Math.abs(number.num)){
                return -1;
            } else {
                if (this.num > number.num) {
                    return 1;
                }
                return -1;
            }
        }
    }
}