import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int[] result;
    public static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        check = new boolean[n + 1];
        result = new int[n];
        make(0);

        System.out.println(sb);
    }

    public static void make(int count) {
        if (count == n) {
            for (int j = 0; j < n; j++){
                sb.append(result[j]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int k = 1; k <= n; k++) {
            if(check[k]) continue;
            result[count] = k;
            check[k] = true;
            make(count + 1);
            check[k] = false;
        }
    }
}