import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean v1 = Boolean.parseBoolean(st.nextToken());
        String op = st.nextToken();
        boolean v2 = Boolean.parseBoolean(st.nextToken());

        System.out.print((op.equals("AND") ? v1 && v2 : v1 || v2) ? "true" : "false");
    }
}
