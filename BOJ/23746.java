import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String ext = st.nextToken();
            char comp = st.nextToken().charAt(0);

            map.put(comp, ext);
        }

        String compString = br.readLine();
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()) - 1;
        int E = Integer.parseInt(st.nextToken()) - 1;

        for (int i = 0; i < compString.length(); i++) {
            sb.append(map.get(compString.charAt(i)));
        }

        System.out.print(sb.substring(S, E + 1));
    }
}
