import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d, e));
            list.remove(Collections.max(list));
            list.remove(Collections.min(list));

            if (Collections.max(list) - Collections.min(list) > 3) {
                bw.append("KIN").append("\n");
            } else {
                int sum = 0;
                for (int num : list) {
                    sum += num;
                }
                bw.append(String.valueOf(sum)).append("\n");
            }


        }
        bw.flush();
        bw.close();
    }
}