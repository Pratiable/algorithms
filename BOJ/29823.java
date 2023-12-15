import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int v = 0;
        int h = 0;
        for (int i = 0; i < n; i++) {
            char now = str.charAt(i);
            if (now == 'N') v++;
            else if (now == 'S') v--;
            else if (now == 'E') h++;
            else if (now == 'W') h--;
        }

        System.out.println(Math.abs(v) + Math.abs(h));
    }
}
