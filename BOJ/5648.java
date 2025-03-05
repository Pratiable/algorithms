import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Long> list = new ArrayList<>();
        StringTokenizer st;
        boolean flag = false;
        String line;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            if (!flag) {
                st.nextToken();
                flag = true;
            }
            while (st.hasMoreTokens()) {
                StringBuilder str = new StringBuilder(st.nextToken()).reverse();
                list.add(Long.parseLong(str.toString()));
            }
        }

        list.sort(Comparator.naturalOrder());

        for (Long integer : list) {
            sb.append(integer).append("\n");
        }

        System.out.println(sb);
    }
}