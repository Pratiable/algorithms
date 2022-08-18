import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st;
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        while (true) {
            st = br.readLine();
            if (Objects.equals(st, "#")) {
                break;
            }
            int sum = 0;
            String[] sentence = st.toLowerCase().split("");
            for (String s: sentence) {
                if (vowels.contains(s)) {
                    sum++;
                }
            }
            bw.append(String.format("%d\n", sum));
        }
        bw.flush();
        bw.close();
    }
}