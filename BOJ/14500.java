import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer[][]>[] blocks = getTetrominos();

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int b = 0; b < blocks.length; b++) {
                    ArrayList<Integer[][]> block = blocks[b];
                    Cal:
                    for (int k = 0; k < block.size(); k++) {
                        Integer[][] now = block.get(k);
                        Integer[] dx = now[0];
                        Integer[] dy = now[1];
                        int sum = 0;
                        for (int l = 0; l < 4; l++) {
                            int nx = i + dx[l];
                            int ny = j + dy[l];
                            if (nx >= n || ny >= m || nx < 0 || ny < 0) continue Cal;
                            sum += map[nx][ny];
                        }

                        max = Math.max(sum, max);
                    }

                }
            }
        }

        System.out.println(max);
    }

    static ArrayList<Integer[][]>[] getTetrominos() {
        ArrayList<Integer[][]>[] blocks = new ArrayList[5];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new ArrayList<>();
        }

        // O
        blocks[0].add(new Integer[2][4]);
        blocks[0].get(0)[0] = new Integer[]{0, 0, 1, 1};
        blocks[0].get(0)[1] = new Integer[]{0, 1, 0, 1};

        // I
        blocks[1].add(new Integer[2][4]);
        blocks[1].get(0)[0] = new Integer[]{0, 0, 0, 0};
        blocks[1].get(0)[1] = new Integer[]{0, 1, 2, 3};
        blocks[1].add(new Integer[2][4]);
        blocks[1].get(1)[0] = blocks[1].get(0)[1];
        blocks[1].get(1)[1] = blocks[1].get(0)[0];

        // T
        for (int i = 0; i < 4; i++) {
            blocks[2].add(new Integer[2][4]);
        }
        blocks[2].get(0)[0] = new Integer[]{0, 0, 0, 1};
        blocks[2].get(0)[1] = new Integer[]{0, 1, 2, 1};
        blocks[2].get(1)[0] = new Integer[]{0, 1, 2, 1};
        blocks[2].get(1)[1] = new Integer[]{0, 0, 0, -1};
        blocks[2].get(2)[0] = new Integer[]{0, 0, 0, -1};
        blocks[2].get(2)[1] = new Integer[]{0, -1, -2, -1};
        blocks[2].get(3)[0] = new Integer[]{0, -1, -2, -1};
        blocks[2].get(3)[1] = new Integer[]{0, 0, 0, 1};

        // J / L
        for (int i = 0; i < 8; i++) {
            blocks[3].add(new Integer[2][4]);
        }
        blocks[3].get(0)[0] = new Integer[]{0, 1, 2, 2};
        blocks[3].get(0)[1] = new Integer[]{0, 0, 0, 1};
        blocks[3].get(1)[0] = new Integer[]{0, 0, 0, 1};
        blocks[3].get(1)[1] = new Integer[]{0, -1, -2, -2};
        blocks[3].get(2)[0] = new Integer[]{0, -1, -2, -2};
        blocks[3].get(2)[1] = new Integer[]{0, 0, 0, -1};
        blocks[3].get(3)[0] = new Integer[]{0, 0, 0, -1};
        blocks[3].get(3)[1] = new Integer[]{0, 1, 2, 2};
        blocks[3].get(4)[0] = new Integer[]{0, 1, 2, 2};
        blocks[3].get(4)[1] = new Integer[]{0, 0, 0, -1};
        blocks[3].get(5)[0] = new Integer[]{0, 0, 0, -1};
        blocks[3].get(5)[1] = new Integer[]{0, -1, -2, -2};
        blocks[3].get(6)[0] = new Integer[]{0, -1, -2, -2};
        blocks[3].get(6)[1] = new Integer[]{0, 0, 0, 1};
        blocks[3].get(7)[0] = new Integer[]{0, 0, 0, 1};
        blocks[3].get(7)[1] = new Integer[]{0, 1, 2, 2};


        // S / Z
        for (int i = 0; i < 4; i++) {
            blocks[4].add(new Integer[2][4]);
        }
        blocks[4].get(0)[0] = new Integer[]{0, 0, -1, -1};
        blocks[4].get(0)[1] = new Integer[]{0, 1, 1, 2};
        blocks[4].get(1)[0] = new Integer[]{0, 1, 1, 2};
        blocks[4].get(1)[1] = new Integer[]{0, 0, 1, 1};
        blocks[4].get(2)[0] = new Integer[]{0, 0, 1, 1};
        blocks[4].get(2)[1] = new Integer[]{0, 1, 1, 2};
        blocks[4].get(3)[0] = new Integer[]{0, 1, 1, 2};
        blocks[4].get(3)[1] = new Integer[]{0, 0, -1, -1};

        return blocks;
    }
}