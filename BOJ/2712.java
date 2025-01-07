import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String str = st.nextToken();

            double cNum = 0.0;
            String cStr = "";

            switch (str) {
                case "kg":
                    cNum = num * 2.2046;
                    cStr = "lb";
                    break;
                case "lb":
                    cNum = num * 0.4536;
                    cStr = "kg";
                    break;
                case "l":
                    cNum = num * 0.2642;
                    cStr = "g";
                    break;
                case "g":
                    cNum = num * 3.7854;
                    cStr = "l";
                    break;
            }

            sb.append(String.format("%.4f %s\n", cNum, cStr));
        }

        System.out.println(sb);
    }
}