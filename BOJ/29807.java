import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[5];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;

        if (scores[0] > scores[2]) {
            result += (scores[0] - scores[2]) * 508L;
        } else {
            result += (scores[2] - scores[0]) * 108L;
        }

        if (scores[1] > scores[3]) {
            result += (scores[1] - scores[3]) * 212L;
        } else {
            result += (scores[3] - scores[1]) * 305L;
        }

        if (scores[4] != 0) {
            result += scores[4] * 707L;
        }

        result *= 4763;

        System.out.println(result);
    }
}