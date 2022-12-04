import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int min;
    static int[] square, newSquare;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        min = Integer.MAX_VALUE;
        square = new int[9];
        newSquare = new int[9];
        visited = new boolean[10];
        st = new StringTokenizer(br.readLine());
        square[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < 9; i++) {
            if (i % 3 == 0) {
                st = new StringTokenizer(br.readLine());
            }
            square[i] = Integer.parseInt(st.nextToken());
        }

        makeMagicSquare(0);
        System.out.println(min);
    }

    static void makeMagicSquare(int depth) {
        if (depth == 9) {
            if (isMagicSquare()) {
                int cost = 0;
                for (int j = 0; j < 9; j++) {
                    cost += Math.abs(square[j] - newSquare[j]);
                }
                min = Math.min(min, cost);
                return;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            newSquare[depth] = i;
            makeMagicSquare(depth + 1);
            visited[i] = false;
            newSquare[depth] = 0;
        }
    }

    static boolean isMagicSquare() {
        int standard = newSquare[0] + newSquare[1] + newSquare[2];
        return standard == newSquare[3] + newSquare[4] + newSquare[5] &&
                standard == newSquare[6] + newSquare[7] + newSquare[8] &&
                standard == newSquare[0] + newSquare[3] + newSquare[6] &&
                standard == newSquare[1] + newSquare[4] + newSquare[7] &&
                standard == newSquare[2] + newSquare[5] + newSquare[8] &&
                standard == newSquare[0] + newSquare[4] + newSquare[8] &&
                standard == newSquare[2] + newSquare[4] + newSquare[6];
    }
}