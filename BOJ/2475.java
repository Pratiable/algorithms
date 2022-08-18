import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()) {
            int uNum = Integer.parseInt(st.nextToken());
            result += Math.pow(uNum, 2);
        }
        System.out.println(result % 10);
    }
}
