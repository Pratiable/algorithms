import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] list = new int[1000];
        int now = 1;
        int count = 1;
        for (int i = 0; i < 1000; i++) {
            if (count == 0) {
                now++;
                count = now;
            }
            list[i] = now;
            count--;
        }

        int[] range = Arrays.stream(list, a - 1, b).toArray();
        System.out.println(Arrays.stream(range).sum());
    }
}