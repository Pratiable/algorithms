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
            int shp = Integer.parseInt(st.nextToken());
            int smp = Integer.parseInt(st.nextToken());
            int satk = Integer.parseInt(st.nextToken());
            int sdef = Integer.parseInt(st.nextToken());
            int ehp = Integer.parseInt(st.nextToken());
            int emp = Integer.parseInt(st.nextToken());
            int eatk = Integer.parseInt(st.nextToken());
            int edef = Integer.parseInt(st.nextToken());
            int fHP = Math.max(1, shp + ehp);
            int fMP = Math.max(1, smp + emp) * 5;
            int fATK = Math.max(0, satk + eatk) * 2;
            int fDEF = (sdef + edef) * 2;

            bw.append(String.valueOf(fHP + fMP + fATK + fDEF)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}
