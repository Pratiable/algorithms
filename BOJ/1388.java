import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[N][M];
        char[][] map = new char[N][M];
        int cnt = 0;

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) continue;
                char now = map[i][j];
                visited[i][j] = true;

                switch (now) {
                    case '-':
                        for (int k = j + 1; k < M; k++) {
                            if (map[i][k] != '-') break;
                            visited[i][k] = true;
                        }
                        cnt++;
                        break;
                    case '|':
                        for (int k = i + 1; k < N; k++) {
                            if (map[k][j] != '|') break;
                            visited[k][j] = true;
                        }
                        cnt++;
                        break;
                }
            }
        }
        System.out.println(cnt);
    }
}
