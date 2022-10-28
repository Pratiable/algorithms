import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());
            String bestSchool = "";
            int d = 0;
            for (int j = 0; j < c; j++) {
                st = new StringTokenizer(br.readLine());
                String school = st.nextToken();
                int drinks = Integer.parseInt(st.nextToken());
                if (drinks > d) {
                    bestSchool = school;
                    d = drinks;
                }
            }
            bw.append(bestSchool).append("\n");
        }

        bw.flush();
        bw.close();
    }
}
