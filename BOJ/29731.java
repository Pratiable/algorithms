import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[] meme = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean flag = false;
            for (String s : meme) {
                if (s.equals(str)) flag = true;
            }

            if (!flag) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
