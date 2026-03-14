import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine()) + 1;

        while (true) {
            String year = Integer.toString(Y);
            boolean[] visited = new boolean[10];
            boolean made = true;

            for (int i = 0; i < year.length(); i++) {
                int cur = year.charAt(i) - '0';
                if (visited[cur]) {
                    made = false;
                    break;
                }

                visited[cur] = true;
            }

            if (made) {
                System.out.print(Y);
                break;
            }

            Y++;
        }
    }
}
