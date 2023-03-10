import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sheep = 0;
        int wolf = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        char[][] matrix = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || matrix[i][j] == '#') continue;
                visited[i][j] = true;
                int nw = 0;
                int ns = 0;

                if (matrix[i][j] == 'v') {
                    nw++;
                } else if(matrix[i][j] == 'o'){
                    ns++;
                }

                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{i, j});

                while (!queue.isEmpty()) {
                    int[] now = queue.poll();

                    for (int l = 0; l < 4; l++) {
                        int nx = now[0] + dx[l];
                        int ny = now[1] + dy[l];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if (visited[nx][ny] || matrix[nx][ny] == '#') continue;
                        visited[nx][ny] = true;

                        if (matrix[nx][ny] == 'v') {
                            nw++;
                        } else if(matrix[nx][ny] == 'o'){
                            ns++;
                        }

                        queue.add(new int[]{nx, ny});
                    }
                }
                if (nw == 0 && ns == 0) continue;

                if (ns > nw) {
                    sheep += ns;
                } else {
                    wolf += nw;
                }
            }
        }

        System.out.println(sheep + " " + wolf);
    }
}