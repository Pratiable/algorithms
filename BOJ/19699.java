import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[] nums;
    static boolean[] visited, made, primeNums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int pMax = 10000;
        primeNums = new boolean[pMax + 1];
        primeNums[0] = primeNums[1] = true;

        for(int i = 2; i * i <= pMax; i++){
            if(!primeNums[i]){
                for(int j = i * i; j <= pMax; j += i) primeNums[j] = true;
            }
        }

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        visited = new boolean[N];
        made = new boolean[pMax];
        boolean isAvailable = false;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);

        for (int i = 0; i < pMax; i++) {
            if (made[i]) {
                isAvailable = true;
                sb.append(i).append(" ");
            }
        }

        System.out.println(isAvailable ? sb : -1);
    }

    static void dfs(int depth, int sum, int start) {
        if (depth == M) {
            if (!primeNums[sum]) {
                made[sum] = true;
            }
            return;
        }

        for (int i = start; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(depth + 1, sum + nums[i], i);
            visited[i] = false;
        }
    }
}