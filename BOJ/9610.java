import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 || y == 0) {
                axis++;
            } else if (x > 0 && y > 0){
                q1++;
            } else if (x > 0 && y < 0){
                q4++;
            } else if (x < 0 && y > 0){
                q2++;
            } else {
                q3++;
            }
        }
        bw.append(String.format("Q1: %d\nQ2: %d\nQ3: %d\nQ4: %d\nAXIS: %d", q1, q2, q3, q4, axis));
        bw.flush();
        bw.close();
    }
}