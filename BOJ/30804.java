import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int usedFruits = 0;
        int left = 0;

        int[] fruitsCount = new int[10];
        int[] fruits = new int[N];

        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        for (int right = 0; right < N; right++) {
            if (fruitsCount[fruits[right]] == 0) {
                usedFruits++;
            }
            fruitsCount[fruits[right]]++;

            if (usedFruits > 2) {
                while (usedFruits > 2) {
                    fruitsCount[fruits[left]]--;

                    if (fruitsCount[fruits[left]] == 0) {
                        usedFruits--;
                    }

                    left++;
                }
            }

            max = Math.max(right - left + 1, max);
        }

        System.out.println(max);
    }
}
