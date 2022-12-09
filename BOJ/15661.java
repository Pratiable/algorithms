import java.io.*;
import java.util.*;

public class Main {
    static int n, min;
    static boolean[] visited;
    static int[][] abilityMap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        min = Integer.MAX_VALUE;
        visited = new boolean[n];
        abilityMap = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                abilityMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        makeTeam(0, 0);
        System.out.println(min);
    }

    static void makeTeam(int depth, int idx) {
        for (int i = idx; i < n; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            calculateScore();
            makeTeam(depth + 1, i + 1);
            visited[i] = false;
        }
    }

    static void calculateScore() {
        int startScore = 0;
        int linkScore = 0;
        for (int i = 0; i < n; i++) {
            boolean isStart = visited[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (isStart && visited[j]) {
                    startScore += abilityMap[i][j];
                } else if (!isStart && !visited[j]) {
                    linkScore += abilityMap[i][j];
                }
            }
        }

        min = Math.min(min, Math.abs(startScore - linkScore));
    }
}