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
            int typoIndex = Integer.parseInt(st.nextToken());
            String typoString = st.nextToken();
            bw.append(typoString.substring(0, typoIndex - 1) + typoString.substring(typoIndex)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}
