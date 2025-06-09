import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()) - 4;
        int[] matchesCount = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int[] numberMatchesCount = new int[100];

        for (int i = 0; i < 100; i++) {
            numberMatchesCount[i] = matchesCount[i/10] + matchesCount[i%10];
        }

        boolean canMake = false;

        Loop:
        for (int i = 0; i < 100 ; i++) {
            for (int j = 0; j < 100; j++) {
                int target = i + j;
                if (target >= 100) continue;
                if (numberMatchesCount[i] + numberMatchesCount[j] + numberMatchesCount[target] == n) {
                    if (i < 10) sb.append("0");
                    sb.append(i).append("+");
                    if (j < 10) sb.append("0");
                    sb.append(j).append("=");
                    if (target < 10) sb.append("0");
                    sb.append(target);
                    canMake = true;
                    break Loop;
                }
            }
        }

        System.out.println(canMake ? sb : "impossible");
    }
}
