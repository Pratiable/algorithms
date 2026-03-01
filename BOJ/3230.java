import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        int[] seq = new int[M];

        for (int i = 1; i <= N; i++) {
            int cur = Integer.parseInt(br.readLine()) - 1;
            first.add(cur, i);
        }

        for (int i = 0; i < M; i++) {
            seq[i] = first.get(M - 1 - i);
        }

        for (int i = 0; i < M; i++) {
            int cur = Integer.parseInt(br.readLine()) - 1;
            second.add(cur, seq[i]);
        }

        sb.append(second.get(0)).append("\n");
        sb.append(second.get(1)).append("\n");
        sb.append(second.get(2)).append("\n");
        System.out.print(sb);
    }
}
