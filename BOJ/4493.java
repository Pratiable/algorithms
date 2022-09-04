import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int p1 = 0;
            int p2 = 0;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String one = st.nextToken();
                String two = st.nextToken();

                if (Objects.equals(one, two)) {
                    continue;
                }

                switch (one) {
                    case "R":
                        if (Objects.equals(two, "P")) {
                            p2 += 1;
                        } else {
                            p1 += 1;
                        }
                        break;
                    case "P":
                        if (Objects.equals(two, "S")) {
                            p2 += 1;
                        } else {
                            p1 += 1;
                        }
                        break;
                    case "S":
                        if (Objects.equals(two, "R")) {
                            p2 += 1;
                        } else {
                            p1 += 1;
                        }
                        break;
                }
            }
            if (p1 > p2) {
                bw.append("Player 1").append("\n");
            } else if (p2 > p1) {
                bw.append("Player 2").append("\n");
            } else {
                bw.append("TIE").append("\n");
            }
        }

        bw.flush();
        bw.close();
    }
}