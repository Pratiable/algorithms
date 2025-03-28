import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());

        System.out.println(Math.max(Cr - Ca, 0) + Math.max(Br - Ba, 0) + Math.max(Pr - Pa, 0));
    }
}
