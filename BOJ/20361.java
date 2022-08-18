import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String cups = st.nextToken();
        String ball = st.nextToken();
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();
            ball = Objects.equals(ball, a) ? b : Objects.equals(ball, b) ? a : ball;
        }
        System.out.println(ball);
    }
}