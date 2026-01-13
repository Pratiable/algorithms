import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String ans;
        int[] scores = new int[50];

        for (int i = 0; i < 50; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int score = Integer.parseInt(br.readLine());
        int rnk = 0;

        for (int i = 0; i < 50; i++) {
            if (scores[i] == score) {
                rnk = i + 1;
                break;
            }
        }

        if (rnk <= 5) ans = "A+";
        else if (rnk <= 15) ans = "A0";
        else if (rnk <= 30) ans = "B+";
        else if (rnk <= 35) ans = "B0";
        else if (rnk <= 45) ans = "C+";
        else if (rnk <= 48) ans = "C0";
        else ans = "F";

        System.out.print(ans);
    }
}
