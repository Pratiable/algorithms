import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();

        String[] msg = new String[N];
        int winner = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            msg[i] = st.nextToken();
            if (name.equals(S)) winner = i;
        }

        String answer = msg[winner];
        int cnt = 0;
        for (int i = 0; i < winner; i++) {
            if (msg[i].equals(answer)) cnt++;
        }

        System.out.print(cnt);
    }
}
