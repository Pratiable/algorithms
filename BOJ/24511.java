import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                deque.addLast(B[i]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] C = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }

        if (deque.isEmpty()) {
            for (int i = 0; i < M; i++) {
                sb.append(C[i]).append(" ");
            }
        } else {
            for (int i = 0; i < M; i++) {
                deque.addFirst(C[i]);
                sb.append(deque.removeLast()).append(" ");
            }
        }

        System.out.print(sb);
    }
}
