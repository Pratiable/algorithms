import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;

        for (int i = 1; i <= k; i++) {
            int target = n * i;
            max = Math.max(max, Integer.parseInt(new StringBuilder(String.valueOf(target)).reverse().toString()));
        }


        System.out.println(max);
    }
}