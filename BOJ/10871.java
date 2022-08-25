import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();
        String[] strNum = br.readLine().split(" ");

        for (String num : strNum) {
            if (Integer.parseInt(num) < x) {
                result.append(String.format("%s ", num));
            }
        }

        System.out.println(result);
    }
}