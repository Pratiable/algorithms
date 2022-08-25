import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = 0;
            while(st.hasMoreTokens()) {
                if (Objects.equals(st.nextToken(), "0")) {
                    x++;
                }
            }
            switch (x) {
                case 0:
                    bw.append("E").append("\n");
                    break;
                case 1:
                    bw.append("A").append("\n");
                    break;
                case 2:
                    bw.append("B").append("\n");
                    break;
                case 3:
                    bw.append("C").append("\n");
                    break;
                case 4:
                    bw.append("D").append("\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}