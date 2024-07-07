import java.io.*;
import java.util.*;

public class Main {
    static int x, y, p, count;
    static boolean[][] map, visited;
    static ArrayList<ArrayList<Integer[]>>[] blocks;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken()) - 1;
        st = new StringTokenizer(br.readLine());
        count = 0;
        x = 0;
        int[] heights = new int[y];
        for (int i = 0; i < y; i++) {
            int next = Integer.parseInt(st.nextToken());
            heights[i] = next;
            x = Math.max(x, next + 4);
        }
        setupBlock();

        map = new boolean[x][y];
        visited = new boolean[x][y];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < heights[i]; j++) {
                map[x - 1 - j][i] = true;
//                visited[i][x - 1 - j] = true;
            }
        }

        for (int h = 0; h < y; h++) {
            for (int i = 0; i < blocks[p].size(); i++) {
                dfs(0, i, x - heights[h], h);
            }
        }

        System.out.println(count);
    }

    static void dfs(int depth, int idx, int i, int j) {
        if (depth == blocks[p].get(idx).size()) {
            if (checkBlock()) {
                count++;
            }
            return;
        }

        int nx = i + blocks[p].get(idx).get(depth)[0];
        int ny = j + blocks[p].get(idx).get(depth)[1];

        if (nx < 0 || nx >= x || ny < 0 || ny >= y) return;
        if (map[nx][ny]) return;
        map[nx][ny] = true;
        dfs(depth + 1, idx, i, j);
        map[nx][ny] = false;
    }

    static boolean checkBlock() {
        for (int j = 0; j < y; j++) {
            boolean isEmpty = false;
            for (int i = x - 1; i >= 0; i--) {
                if (map[i][j] && isEmpty) {
                    return false;
                } else if (!map[i][j]) {
                    isEmpty = true;
                }
            }
        }

        return true;
    }

    static void setupBlock() {
        blocks = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            blocks[i] = new ArrayList<>();
        }
        // line
        blocks[0].add(new ArrayList<>());
        blocks[0].get(0).add(new Integer[]{-1, 0});
        blocks[0].get(0).add(new Integer[]{-2, 0});
        blocks[0].get(0).add(new Integer[]{-3, 0});
        blocks[0].get(0).add(new Integer[]{-4, 0});
        blocks[0].add(new ArrayList<>());
        blocks[0].get(1).add(new Integer[]{-1, 0});
        blocks[0].get(1).add(new Integer[]{-1, 1});
        blocks[0].get(1).add(new Integer[]{-1, 2});
        blocks[0].get(1).add(new Integer[]{-1, 3});
        // square
        blocks[1].add(new ArrayList<>());
        blocks[1].get(0).add(new Integer[]{-1, 0});
        blocks[1].get(0).add(new Integer[]{-2, 0});
        blocks[1].get(0).add(new Integer[]{-1, 1});
        blocks[1].get(0).add(new Integer[]{-2, 1});
        // s
        blocks[2].add(new ArrayList<>());
        blocks[2].get(0).add(new Integer[]{-1, 0});
        blocks[2].get(0).add(new Integer[]{-1, 1});
        blocks[2].get(0).add(new Integer[]{-2, 1});
        blocks[2].get(0).add(new Integer[]{-2, 2});
        blocks[2].add(new ArrayList<>());
        blocks[2].get(1).add(new Integer[]{-1, 0});
        blocks[2].get(1).add(new Integer[]{-2, 0});
        blocks[2].get(1).add(new Integer[]{-1, 1});
        blocks[2].get(1).add(new Integer[]{0, 1});
        // z
        blocks[3].add(new ArrayList<>());
        blocks[3].get(0).add(new Integer[]{-1, 0});
        blocks[3].get(0).add(new Integer[]{-1, 1});
        blocks[3].get(0).add(new Integer[]{0, 1});
        blocks[3].get(0).add(new Integer[]{0, 2});
        blocks[3].add(new ArrayList<>());
        blocks[3].get(1).add(new Integer[]{-1, 0});
        blocks[3].get(1).add(new Integer[]{-2, 0});
        blocks[3].get(1).add(new Integer[]{-2, 1});
        blocks[3].get(1).add(new Integer[]{-3, 1});
        // T
        blocks[4].add(new ArrayList<>());
        blocks[4].get(0).add(new Integer[]{-1, 0});
        blocks[4].get(0).add(new Integer[]{-1, 1});
        blocks[4].get(0).add(new Integer[]{-1, 2});
        blocks[4].get(0).add(new Integer[]{-2, 1});
        blocks[4].add(new ArrayList<>());
        blocks[4].get(1).add(new Integer[]{-1, 0});
        blocks[4].get(1).add(new Integer[]{-2, 0});
        blocks[4].get(1).add(new Integer[]{-3, 0});
        blocks[4].get(1).add(new Integer[]{-2, 1});
        blocks[4].add(new ArrayList<>());
        blocks[4].get(2).add(new Integer[]{-1, 0});
        blocks[4].get(2).add(new Integer[]{-1, 1});
        blocks[4].get(2).add(new Integer[]{-1, 2});
        blocks[4].get(2).add(new Integer[]{0, 1});
        blocks[4].add(new ArrayList<>());
        blocks[4].get(3).add(new Integer[]{-1, 0});
        blocks[4].get(3).add(new Integer[]{-2, 0});
        blocks[4].get(3).add(new Integer[]{-3, 0});
        blocks[4].get(3).add(new Integer[]{-2, -1});
        // L Reverse
        blocks[5].add(new ArrayList<>());
        blocks[5].get(0).add(new Integer[]{-1, 0});
        blocks[5].get(0).add(new Integer[]{-1, 1});
        blocks[5].get(0).add(new Integer[]{-1, 2});
        blocks[5].get(0).add(new Integer[]{-2, 2});
        blocks[5].add(new ArrayList<>());
        blocks[5].get(1).add(new Integer[]{-1, 0});
        blocks[5].get(1).add(new Integer[]{-2, 0});
        blocks[5].get(1).add(new Integer[]{-3, 0});
        blocks[5].get(1).add(new Integer[]{-1, 1});
        blocks[5].add(new ArrayList<>());
        blocks[5].get(2).add(new Integer[]{-1, 0});
        blocks[5].get(2).add(new Integer[]{-2, 0});
        blocks[5].get(2).add(new Integer[]{-2, 1});
        blocks[5].get(2).add(new Integer[]{-2, 2});
        blocks[5].add(new ArrayList<>());
        blocks[5].get(3).add(new Integer[]{-1, 0});
        blocks[5].get(3).add(new Integer[]{-1, 1});
        blocks[5].get(3).add(new Integer[]{0, 1});
        blocks[5].get(3).add(new Integer[]{1, 1});
        //L
        blocks[6].add(new ArrayList<>());
        blocks[6].get(0).add(new Integer[]{-1, 0});
        blocks[6].get(0).add(new Integer[]{-1, 1});
        blocks[6].get(0).add(new Integer[]{-1, 2});
        blocks[6].get(0).add(new Integer[]{-2, 0});
        blocks[6].add(new ArrayList<>());
        blocks[6].get(1).add(new Integer[]{-1, 0});
        blocks[6].get(1).add(new Integer[]{-2, 0});
        blocks[6].get(1).add(new Integer[]{-3, 0});
        blocks[6].get(1).add(new Integer[]{-3, 1});
        blocks[6].add(new ArrayList<>());
        blocks[6].get(2).add(new Integer[]{-1, 0});
        blocks[6].get(2).add(new Integer[]{-1, 1});
        blocks[6].get(2).add(new Integer[]{-1, 2});
        blocks[6].get(2).add(new Integer[]{0, 2});
        blocks[6].add(new ArrayList<>());
        blocks[6].get(3).add(new Integer[]{-1, 0});
        blocks[6].get(3).add(new Integer[]{-1, 1});
        blocks[6].get(3).add(new Integer[]{-2, 1});
        blocks[6].get(3).add(new Integer[]{-3, 1});
    }
}