import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> extensions = new TreeMap<>(Comparator.naturalOrder());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String extension = st.nextToken();
            extensions.put(extension, extensions.getOrDefault(extension, 0) + 1);
        }

        for (Map.Entry<String, Integer> extension : extensions.entrySet()) {
            sb.append(extension.getKey()).append(" ").append(extension.getValue()).append("\n");
        }

        System.out.println(sb);
    }
}