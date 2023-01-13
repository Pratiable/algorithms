import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int cnt = 0;

        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (map[row][col] == 1) {
                    queue.add(new Coordinate(row, col));
                    cnt++;
					map[row][col] = 0;
                    int total = 1;

                    while (!queue.isEmpty()) {
                        Coordinate now = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];

                            if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                            if (map[nx][ny] != 1) continue;
                            total++;
                            map[nx][ny] = 0;
                            queue.add(new Coordinate(nx, ny));
                        }
                    }

                    list.add(total);
                }
            }
        }
        sb.append(cnt).append("\n");

        Collections.sort(list);
        for (int num: list) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }

    static class Coordinate {
        int x, y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}