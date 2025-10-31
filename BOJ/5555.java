import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine().repeat(2);
            if (str.contains(target)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
