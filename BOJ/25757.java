import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        String type = st.nextToken();
        int size = type.equals("Y") ? 1 : type.equals("F") ? 2 : 3;

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        System.out.print(set.size() / size);
    }
}
