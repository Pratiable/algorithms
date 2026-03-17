import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int[] rooms = new int[N];

        for (int i = 0; i < G; i++) {
            int group = Integer.parseInt(br.readLine());

            for (int j = 0; j < N && group >= 2; j++) {
                if (rooms[j] == 0) {
                    rooms[j] = 2;
                    group -= 2;
                }
            }

            if (group == 1) {
                for (int j = 0; j < N; j++) {
                    if (rooms[j] == 0) {
                        rooms[j] = 1;
                        group--;
                        break;
                    }
                }
            }

            while (group > 0) {
                for (int j = 0; j < N && group > 0; j++) {
                    if (rooms[j] == 1) {
                        rooms[j]++;
                        group--;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(rooms[i]).append("\n");
        }

        System.out.print(sb);
    }
}
