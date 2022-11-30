import java.io.*;
import java.util.*;

public class Main {
    static int min, n;
    static int[] sours, bitters;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        min = 2000000000;
        visited = new boolean[n];
        sours = new int[n];
        bitters = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sours[i] = Integer.parseInt(st.nextToken());
            bitters[i] = Integer.parseInt(st.nextToken());
        }
        cook(0, 0, 1, 0);
        System.out.println(min);
    }

    static void cook(int idx, int depth, int sour, int bitter) {
        if (depth == n) {
            return;
        }

        for(int j = idx; j < n; j++) {
            if (visited[j]) continue;
            visited[j] = true;
            min = Math.min(min, Math.abs((sour * sours[j]) - (bitter + bitters[j])));
            cook(j, depth + 1, sour * sours[j], bitter + bitters[j]);
            visited[j] = false;
        }
    }
}