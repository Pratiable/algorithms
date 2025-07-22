import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            teams.add(new Team(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        teams.sort((a, b) -> {
            if (a.s != b.s) return b.s - a.s;
            return a.p - b.p;
        });

        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (Team t : teams) {
            if (!set.contains(t.u)) {
                set.add(t.u);
                cnt++;
                sb.append(t.n).append("\n");

                if (cnt == k) break;
            }
        }

        System.out.println(sb);
    }

    static class Team {
        String u, n;
        int s, p;

        Team(String u, String n, int s, int p) {
            this.u = u;
            this.n = n;
            this.s = s;
            this.p = p;
        }
    }
}
