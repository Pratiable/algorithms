import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (now >= 65 && now <= 90) {
                result.append((char) (((now - 52) % 26) + 65));
            } else if (now >= 97 && now <= 122) {
                result.append((char) (((now - 84) % 26) + 97));
            } else {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}