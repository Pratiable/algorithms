import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] straws = new int[N];
        for (int i = 0; i < N; i++) {
            straws[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(straws);

        for (int i = N - 1; i >= 2; i--) {
            int a = straws[i];
            int b = straws[i - 1];
            int c = straws[i - 2];
            
            if (c + b > a) {
                System.out.print(a + b + c);
                return;
            }
        }

        System.out.print(-1);
    }
}
