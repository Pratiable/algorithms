import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] parking = new int[101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < y; j++) parking[j]++;
        }

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            switch (parking[i]) {
                case 1:
                    sum += a;
                    break;
                case 2:
                    sum += b * 2;
                    break;
                case 3:
                    sum += c * 3;
                    break;
                default:
                    break;
            }
        }

        System.out.println(sum);
    }
}