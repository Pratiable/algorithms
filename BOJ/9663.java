import java.io.*;

public class Main {
    static int n, cnt;
    static boolean[][] chessboard;
    static boolean[] visitedCol;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cnt = 0;
        visitedCol = new boolean[n];
        chessboard = new boolean[n][n];
        setQueen(0);
        System.out.println(cnt);
    }

    static void setQueen(int queens) {
        if (queens == n) {
            cnt++;
            return;
        }

            for (int j = 0; j < n; j++) {
                if (visitedCol[j]) continue;
                if (canSet(queens, j)) {
                    visitedCol[j] = true;
                    chessboard[queens][j] = true;
                    setQueen(queens + 1);
                    chessboard[queens][j] = false;
                    visitedCol[j] = false;
                }
            }
    }

    static boolean canSet(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (chessboard[i][y]) return false;
        }
        int a = x;
        int b = y;
        while (a >= 0 && b >= 0) {
            if (chessboard[a--][b--]) return false;
        }

        a = x;
        b = y;
        while (a >= 0 && b >= 0 && b < n) {
            if (chessboard[a--][b++]) return false;
        }

        return true;
    }
}