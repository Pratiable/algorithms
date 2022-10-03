import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] paper = new int[101][101];
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int[] yCoordinate: paper) {
            for (int xCoordinate: yCoordinate) {
                result += xCoordinate;
            }
        }

        System.out.println(result);
    }
}