import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            sb.append(t + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 0;
            ArrayList<Integer> students = new ArrayList<>();
            students.add(Integer.parseInt(st.nextToken()));

            for (int i = 1; i < 20; i++) {
                int now = Integer.parseInt(st.nextToken());
                students.add(now);
                for (int k = i; k >= 1; k--) {
                    if (now > students.get(k - 1)) break;
                    int tmp = students.get(k - 1);
                    students.set(k - 1, now);
                    students.set(k, tmp);
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
