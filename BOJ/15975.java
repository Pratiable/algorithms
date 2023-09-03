import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Dot>[] points = new ArrayList[n + 1];
        long sum = 0;

        for (int i = 0; i < n + 1; i++) {
            points[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());
            points[color].add(new Dot(color, point));
        }

        for (int i = 0; i < n + 1; i++) {
            points[i].sort(Comparator.comparing(o1 -> o1.point));
        }

        for (int i = 0; i < n + 1; i++) {
            if (points[i].size() == 1) continue;
            for (int j = 0; j < points[i].size(); j++) {
                Dot dot = points[i].get(j);
                if (j == 0) {
                    sum += points[i].get(j + 1).point - dot.point;
                } else if (j == points[i].size() - 1) {
                    sum += dot.point - points[i].get(j - 1).point;
                } else {
                    sum += Math.min(dot.point - points[i].get(j - 1).point, points[i].get(j + 1).point - dot.point);
                }
            }
        }

        System.out.println(sum);
    }

    static class Dot {
        int color, point;

        public Dot(int color, int point) {
            this.color = color;
            this.point = point;
        }
    }
}