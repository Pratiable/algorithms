import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, max, END = 5;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        StringTokenizer st;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, map);

        System.out.println(max);
    }

    static void dfs(int depth, int[][] board) {
        if (depth == END) {
            cal(board);
            return;
        }

        dfs(depth + 1, moveUp(copyBoard(board)));
        dfs(depth + 1, moveDown(copyBoard(board)));
        dfs(depth + 1, moveLeft(copyBoard(board)));
        dfs(depth + 1, moveRight(copyBoard(board)));
    }

    static int[][] moveUp(int[][] board) {
        for (int i = 0; i < n; i++) {
            int idx = 0;
            int prev = 0;

            for (int j = 0; j < n; j++) {
                int now = board[j][i];
                if (now == 0) continue;
                if (prev == 0) {
                    prev = now;
                } else if (prev == now) {
                    board[idx++][i] = prev * 2;
                    prev = 0;
                } else {
                    board[idx++][i] = prev;
                    prev = now;
                }
            }

            if (prev != 0) board[idx++][i] = prev;

            for (int j = idx; j < n; j++) {
                board[j][i] = 0;
            }
        }

        return board;
    }

    static int[][] moveDown(int[][] board) {
        for (int i = 0; i < n; i++) {
            int idx = n - 1;
            int prev = 0;

            for (int j = n - 1; j >= 0; j--) {
                int now = board[j][i];
                if (now == 0) continue;
                if (prev == 0) {
                    prev = now;
                } else if (prev == now) {
                        board[idx--][i] = prev * 2;
                        prev = 0;
                } else {
                        board[idx--][i] = prev;
                        prev = now;
                }
            }

            if (prev != 0) board[idx--][i] = prev;

            for (int j = idx; j >= 0; j--) {
                board[j][i] = 0;
            }
        }

        return board;
    }

    static int[][] moveLeft(int[][] board) {
        for (int i = 0; i < n; i++) {
            int idx = 0;
            int prev = 0;

            for (int j = 0; j < n; j++) {
                int now = board[i][j];
                if (now == 0) continue;
                if (prev == 0) {
                    prev = now;
                } else if (prev == now) {
                    board[i][idx++] = prev * 2;
                    prev = 0;
                } else {
                    board[i][idx++] = prev;
                    prev = now;
                }

            }

            if (prev != 0) board[i][idx++] = prev;

            for (int j = idx; j < n; j++) {
                board[i][j] = 0;
            }
        }

        return board;
    }

    static int[][] moveRight(int[][] board) {
        for (int i = 0; i < n; i++) {
            int idx = n - 1;
            int prev = 0;

            for (int j = n - 1; j >= 0; j--) {
                int now = board[i][j];
                if (now == 0) continue;
                if (prev == 0) {
                    prev = now;
                } else if (prev == now) {
                    board[i][idx--] = prev * 2;
                    prev = 0;
                } else {
                    board[i][idx--] = prev;
                    prev = now;
                }
            }

            if (prev != 0) board[i][idx--] = prev;

            for (int j = idx; j >= 0; j--) {
                board[i][j] = 0;
            }
        }

        return board;
    }

    static void cal(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > max) max = board[i][j];
            }
        }
    }

    static int[][] copyBoard(int[][] array) {
        int[][] copy = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            copy[i] = new int[array[i].length];
            System.arraycopy(array[i], 0, copy[i], 0, array[i].length);
        }
        return copy;
    }
}