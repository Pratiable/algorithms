import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int n = 0;
        int m = 0;

        for (int i = 0; i < A.length(); i++) {
            boolean isSame = false;

            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    n = i;
                    m = j;
                    isSame = true;
                    break;
                }
            }

            if (isSame) break;
        }

        for (int i = 0; i < B.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                if (i == m) {
                    sb.append(A.charAt(j));
                } else if (j == n) {
                    sb.append(B.charAt(i));
                } else {
                    sb.append(".");
                }
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
