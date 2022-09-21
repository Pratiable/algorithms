import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int score = 0;
            int streak = 0;
            String[] result = br.readLine().split("");
            for (String str: result) {
                if (Objects.equals(str, "O")) {
                    streak++;
                    score += streak;
                } else {
                    streak = 0;
                }
            }
            bw.append(String.valueOf(score)).append("\n");
        }
        
        bw.flush();
        bw.close();
    }
}