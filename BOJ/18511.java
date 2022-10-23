import java.io.*;
import java.util.*;

public class Main {
    public static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        make(0, n, list);

        System.out.println(max);
        bw.flush();
        bw.close();
    }

    public static void make(int now, int limit, ArrayList<Integer> nums) {
        if (now > limit) return;
        max = Math.max(now, max);
        for (int n: nums) {
            make((now * 10) + n, limit, nums);
        }
    }
}