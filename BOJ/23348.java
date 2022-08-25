import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                temp += Integer.parseInt(st.nextToken()) * x;
                temp += Integer.parseInt(st.nextToken()) * y;
                temp += Integer.parseInt(st.nextToken()) * z;
            }

            max = Math.max(max, temp);
            temp = 0;
        }
        System.out.println(max);
    }
}