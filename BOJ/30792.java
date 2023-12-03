import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int myVote = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] votes = new Integer[n];
        votes[n - 1] = myVote;

        for (int i = 0; i < n - 1; i++) {
            votes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(votes, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (votes[i] == myVote) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
