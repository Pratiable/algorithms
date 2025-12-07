import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int length = Math.max(A.length(), B.length());
        int[] a = new int[length];
        int[] b = new int[length];

        for (int i = 0; i < A.length(); i++) {
            a[length - A.length() + i] = A.charAt(i) - '0';
        }

        for (int i = 0; i < B.length(); i++) {
            b[length - B.length() + i] = B.charAt(i) - '0';
        }

        for (int i = 0; i < length; i++) {
            sb.append(a[i] + b[i]);
        }

        System.out.println(sb);
    }
}
