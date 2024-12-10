import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        
        for (int i = 0; i <= n - 4; i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'P' && str.charAt(i + 2) == 'A' && str.charAt(i + 3) == 'p') {
                cnt++;
                i += 3;
            }
        }

        System.out.println(cnt);
    }
}