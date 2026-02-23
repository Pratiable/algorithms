import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] P = new int[M];

        for (int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(P);

        int max = Integer.MIN_VALUE;
        int maxIncome = Integer.MIN_VALUE;

        for (int i = 0; i < M; i++) {
            int price = P[i];
            int customers = M - i;
            int count = Math.min(N, customers);
            int income = price * count;

            if (income > maxIncome) {
                maxIncome = income;
                max = price;
            } else if (income == maxIncome) {
                if (price < max) {
                    max = price;
                }
            }
        }

        System.out.print(max + " " + maxIncome);
    }
}
