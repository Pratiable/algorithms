import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int tem = -30;
        int oc = 0;
        int ox = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            switch (str) {
                case "ocean":
                    oc += num;
                    break;
                case "temperature":
                    tem += num;
                    break;
                case "oxygen":
                    ox += num;
                    break;
            }
        }

        System.out.println(tem >= 8 && oc >= 9 && ox >= 14  ? "liveable" : "not liveable");
    }
}
