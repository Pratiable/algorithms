import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Long[] classes = new Long[n];
        Long sum = 0L;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            Long now = Long.parseLong(st.nextToken());
            sum += now;
            classes[i] = sum;
        }

        Arrays.sort(classes, Collections.reverseOrder());

        Long result = 0L;

        for (int i = 0; i < k; i++) {
            result += classes[i];
        }

        System.out.println(result);
    }
}
