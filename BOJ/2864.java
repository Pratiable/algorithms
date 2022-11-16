import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        sb.append(change('6', '5', a) + change('6', '5', b)).append(" ").append(change('5', '6', a) + change('5', '6', b));
        System.out.println(sb);
    }

    public static int change(char from, char to, String num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            result.append(num.charAt(i) == from ? to : num.charAt(i));
        }

        return Integer.parseInt(result.toString());
    }
}