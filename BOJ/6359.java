import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int[] rooms = new int[n + 1];
            Arrays.fill(rooms, 1);
            for (int j = 2; j < rooms.length; j++){
                for (int k = 2; k < rooms.length; k++) {
                    if (k % j == 0) {
                        rooms[k] = rooms[k] == 0 ? 1 : 0;
                    }
                }
            }
            bw.append(String.valueOf(Arrays.stream(rooms).sum() - 1)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}