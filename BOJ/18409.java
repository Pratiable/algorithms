import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}