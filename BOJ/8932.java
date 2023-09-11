import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Type[] types = {
            new Type(9.23076, 26.7, 1.835, true),
            new Type(1.84523, 75, 1.348, false),
            new Type(56.0211, 1.5, 1.05, false),
            new Type(4.99087, 42.5, 1.81, true),
            new Type(0.188807, 210, 1.41, false),
            new Type(15.9803, 3.8, 1.04, false),
            new Type(0.11193, 254, 1.88, true)
        };
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                int score = Integer.parseInt(st.nextToken());
                Type type = types[i];
                if (type.isTrack) {
                    sum += (int) (type.a * (Math.pow(type.b - score, type.c)));
                } else {
                    sum += (int) (type.a * (Math.pow(score - type.b, type.c)));
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

    static class Type {
        double a, b, c;

        public Type(double a, double b, double c, boolean isTrack) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.isTrack = isTrack;
        }

        boolean isTrack;
    }
}