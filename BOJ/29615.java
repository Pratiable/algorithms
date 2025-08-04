import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] waitingList = new int[N];
        Set<Integer> friends = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            waitingList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            friends.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            if (!friends.contains(waitingList[i])) cnt++;
        }

        System.out.println(cnt);
    }
}
