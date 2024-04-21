import java.io.*;
import java.util.*;

public class Main {
    static int[] lamps;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] switches = new ArrayList[n + 1];
        lamps = new int[m + 1];

        for (int i = 1; i < n + 1; i++) {
            switches[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            for (int j = 0; j < l; j++) {
                int now = Integer.parseInt(st.nextToken());
                switches[i].add(now);
                lamps[now]++;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < switches[i].size(); j++) {
                lamps[switches[i].get(j)]--;
            }
            if (isOn()) {
                System.out.println(1);
                return;
            }

            for (int j = 0; j < switches[i].size(); j++) {
                lamps[switches[i].get(j)]++;
            }
        }


        System.out.println(0);
    }

    static boolean isOn() {
        for (int i = 1; i < lamps.length; i++) {
            if (lamps[i] == 0) return false;
        }

        return true;
    }
}
