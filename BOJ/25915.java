import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s = br.readLine().charAt(0);
        String str = "ILOVEYONSEI";
        int move = 0;
        int idx = s - 'A';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int next = c - 'A';
            int dist = Math.abs(next - idx);

            move += dist;
            idx = next;
        }

        System.out.println(move);
    }
}