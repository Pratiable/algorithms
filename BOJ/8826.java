import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                switch (c) {
                    case 'E':
                        x += 1;
                        break;
                    case 'W':
                        x -= 1;
                        break;
                    case 'N':
                        y += 1;
                        break;
                    case 'S':
                        y -= 1;
                        break;
                }
            }
            sb.append(Math.abs(x) + Math.abs(y)).append("\n");
        }
        
        System.out.println(sb);
    }
}
