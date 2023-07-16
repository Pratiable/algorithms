import java.io.*;
import java.util.*;

public class Main {
    static int[][] map, watched;
    static boolean[][][] directions;
    static boolean[][] visited;
    static int n, m, min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;

        directions = new boolean[5][4][4];
        directions[1] = new boolean[][]{{true, false, false, false}, {false, true, false, false}, {false, false, true, false}, {false, false, false, true}};
        directions[2] = new boolean[][]{{true, false, true, false}, {false, true, false, true}};
        directions[3] = new boolean[][]{{true, true, false, false}, {false, true, true, false}, {false, false, true, true}, {true, false, false, true}};
        directions[4] = new boolean[][]{{true, true, false, true}, {true, true, true, false}, {false, true, true, true}, {true, false, true, true}};

        map = new int[n][m];
        watched = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] != 0) {
                    watched[i][j] = -99;
                }
            }
        }

        dfs(0, 0);
        System.out.println(min);
    }

    static public void dfs(int x, int y) {
        for (int i = x; i < n; i++) {
            for (int j = (i == x) ? y : 0; j < m; j++) {
                if (visited[i][j]) continue;
                switch (map[i][j]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        for (int k = 0; k < directions[map[i][j]].length; k++) {
                            addCam(i, j, directions[map[i][j]][k]);
                            visited[i][j] = true;
                            if (i == n - 1 && j == m - 1) {
                                int cnt = 0;

                                for (int cx = 0; cx < n; cx++) {
                                    for (int cy = 0; cy < m; cy++) {
                                        if (watched[cx][cy] == 0) {
                                            cnt++;
                                        }
                                    }
                                }
                                min = Math.min(cnt, min);
                                removeCam(i, j, directions[map[i][j]][k]);
                                visited[i][j] = false;
                                continue;
                            }
                            dfs(i, j + 1);
                            visited[i][j] = false;
                            removeCam(i, j, directions[map[i][j]][k]);
                        }
                        break;
                    case 5:
                        addCam(i, j, new boolean[]{true, true, true, true});
                        if (i == n - 1 && j == m - 1) {
                            int cnt = 0;

                            for (int cx = 0; cx < n; cx++) {
                                for (int cy = 0; cy < m; cy++) {
                                    if (watched[cx][cy] == 0) {
                                        cnt++;
                                    }
                                }
                            }
                            min = Math.min(cnt, min);
                            return;
                        }
                        visited[i][j] = true;
                        break;
                    default:
                        if (i == n - 1 && j == m - 1) {
                            int cnt = 0;

                            for (int cx = 0; cx < n; cx++) {
                                for (int cy = 0; cy < m; cy++) {
                                    if (watched[cx][cy] == 0) {
                                        cnt++;
                                    }
                                }
                            }
                            min = Math.min(cnt, min);
                            return;
                        }
                        visited[i][j] = true;
                        break;
                }
            }
        }
    }

    static public void addCam(int x, int y, boolean[] direction) {
        if (direction[0]) {
            for (int i = x; i >= 0; --i) {
                if (map[i][y] == 6) break;
                watched[i][y]++;
            }
        }

        if (direction[1]) {
            for (int i = y; i < m; ++i) {
                if (map[x][i] == 6) break;
                watched[x][i]++;
            }
        }

        if (direction[2]) {
            for (int i = x; i < n; ++i) {
                if (map[i][y] == 6) break;
                watched[i][y]++;
            }
        }

        if (direction[3]) {
            for (int i = y; i >= 0; --i) {
                if (map[x][i] == 6) break;
                watched[x][i]++;
            }
        }
    }

    static public void removeCam(int x, int y, boolean[] direction) {
        if (direction[0]) {
            for (int i = x; i >= 0; --i) {
                if (map[i][y] == 6) break;
                watched[i][y]--;
            }
        }

        if (direction[1]) {
            for (int i = y; i < m; ++i) {
                if (map[x][i] == 6) break;
                watched[x][i]--;
            }
        }

        if (direction[2]) {
            for (int i = x; i < n; ++i) {
                if (map[i][y] == 6) break;
                watched[i][y]--;
            }
        }

        if (direction[3]) {
            for (int i = y; i >= 0; --i) {
                if (map[x][i] == 6) break;
                watched[x][i]--;
            }
        }
    }
}