import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
            list[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken());
            if (s == e) continue;

            String[] reverseArr = Arrays.copyOfRange(list, s, e);
            for (int j = 0; j < reverseArr.length; j++) {
                list[s++] = reverseArr[reverseArr.length - (j + 1)];
            }
        }
        System.out.println(String.join(" ", list));
    }
}