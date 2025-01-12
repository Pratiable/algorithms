import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String prev = br.readLine();
        String now = br.readLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (prev.charAt(i) == 'C' && now.charAt(i) == 'C') cnt++;
        }

        System.out.println(cnt);
    }
}
