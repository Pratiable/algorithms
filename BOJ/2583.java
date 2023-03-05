import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[m][n];
        int cnt = 0;
        ArrayList<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int l = y1; l < y2; l++) {
                    matrix[j][l] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                    cnt++;
                    int size = 1;
                    Queue<int[]> queue = new LinkedList<>();

                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] now = queue.poll();

                        for (int l = 0; l < 4; l++) {
                            int nx = now[0] + dx[l];
                            int ny = now[1] + dy[l];
                            if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                            if (matrix[nx][ny] == 1) continue;
                            matrix[nx][ny] = 1;
                            size++;
                            queue.add(new int[]{nx, ny});
                        }
                    }

                    sizes.add(size);
                }
            }
        }

        Collections.sort(sizes);

        sb.append(cnt).append("\n");
        for (Integer size : sizes) {
            sb.append(size).append(" ");
        }

        System.out.println(sb);
    }
}