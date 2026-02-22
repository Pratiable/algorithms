import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] S = br.readLine().toCharArray();
        int len = S.length;
        int i = 0;

        while (i < len) {
            if (S[i] == '<') {
                int j = i;
                while (j < len && S[j] != '>') {
                    j++;
                }

                for (int k = i; k <= j; k++) {
                    sb.append(S[k]);
                }

                i = j + 1;
            } else if (S[i] == ' ') {
                sb.append(" ");
                i++;
            } else {
                int j = i;
                while (j < len && S[j] != ' ' && S[j] != '<') {
                    j++;
                }

                for (int k = j - 1; k >= i; k--) {
                    sb.append(S[k]);
                }

                i = j;
            }
        }

        System.out.print(sb);
    }
}
