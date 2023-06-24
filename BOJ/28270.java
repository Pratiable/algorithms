import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] M = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] result = new int[N];
        
        Stack<Integer>[] stack = new Stack[N + 1];
        
        for(int i = 0; i < N + 1; i++) {
            stack[i] = new Stack<Integer>();
        }
        
        for (int i = 0; i < N; i++) {
            if (i > 0 && M[i] > M[i - 1] + 1) {
                System.out.println(-1);
                return;
            }
            stack[M[i]].push(stack[M[i]].isEmpty() ? 1 : stack[M[i]].peek() + 1);
            result[i] = stack[M[i]].peek();
            
            if(M[i] + 1 <= N) {
                stack[M[i] + 1].clear();
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        
        System.out.print(sb);
    }
}
