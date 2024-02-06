import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int v = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u') {
                v++;
            } else if (now == 'y') {
                y++;
            }
        }
        
        System.out.println(v + " " + (v + y));
    }
}
