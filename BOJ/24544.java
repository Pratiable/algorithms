import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        int myViewSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            if (b == 1) myViewSum += arr[i];
        }

        System.out.println(sum);
        System.out.println(sum - myViewSum);
    }
}
