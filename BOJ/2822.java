import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Quiz[] quiz = new Quiz[8];
        int[] idx = new int[5];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            quiz[i] = new Quiz(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(quiz, (a, b) -> b.score - a.score);

        for (int i = 0; i < 5; i++) {
            sum += quiz[i].score;
            idx[i] = quiz[i].idx;
        }

        Arrays.sort(idx);

        sb.append(sum).append("\n");

        for (int i = 0; i < 5; i++) {
            sb.append(idx[i] + 1).append(" ");
        }

        System.out.print(sb);
    }

    static class Quiz {
        int score, idx;

        Quiz(int score, int idx) {
            this.score = score;
            this.idx = idx;
        }
    }
}
