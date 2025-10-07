import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();

        while (st.hasMoreTokens()) {
            String cur = st.nextToken();

            if (!set.add(cur)) {
                System.out.print("no");
                return;
            }
        }

        System.out.print("yes");
    }
}
