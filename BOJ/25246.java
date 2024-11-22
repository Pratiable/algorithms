import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int lastIdx = -1;
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u') {
                lastIdx = i;
            }
        }

        System.out.println(str.substring(0, lastIdx + 1) + "ntry");
    }
}