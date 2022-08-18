import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int by, bm, bd, ny, nm, nd;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        by = Integer.parseInt(st.nextToken());
        bm = Integer.parseInt(st.nextToken());
        bd = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ny = Integer.parseInt(st.nextToken());
        nm = Integer.parseInt(st.nextToken());
        nd = Integer.parseInt(st.nextToken());
        int yAge = ny - by;
        int age = yAge == 0 ? 0 : nm > bm ? yAge : nm == bm && nd >= bd ? yAge : yAge - 1;
        int cAge = yAge + 1;
        bw.append(String.format("%d\n%d\n%d", age, cAge, yAge));
        bw.flush();
        bw.close();
    }
}
