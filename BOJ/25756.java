import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.0######");
        double b = 0;

        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(st.nextToken());
            b = 1 - (1 - b) * (1 - a / 100.0);
            sb.append(df.format(b * 100)).append("\n");
        }

        System.out.println(sb);
    }
}