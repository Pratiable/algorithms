import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int counter = 0;

        while (true) {
            str = br.readLine();
            if (str.equals("0")) break;
            StringBuilder cur = new StringBuilder();
            String prev = str;
            while (true) {
                if (prev.length() % 2 == 1) {
                    cur.append(prev);
                    break;
                }
                for (int i = 0; i < prev.length(); i += 2) {
                    cur.append(Character.toString(prev.charAt(i + 1)).repeat(prev.charAt(i) - '0'));
                }
                if (prev.contentEquals(cur) || cur.length() % 2 == 1) break;
                prev = cur.toString();
                cur = new StringBuilder();
            }
            sb.append("Test ").append(++counter).append(": ").append(cur).append("\n");
        }

        System.out.println(sb);
    }
}