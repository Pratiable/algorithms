import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        for (int i = 0; i < 10; i++) {
            int cmd = Integer.parseInt(br.readLine());
            if (cmd == 1) {
                n = (n + 1) % 4;
            } else if (cmd == 2) {
                n = (n + 2) % 4;
            } else if (cmd == 3) {
                n = (n + 3) % 4;
            }
        }

        String[] direction = {"N", "E", "S", "W"};
        System.out.println(direction[n]);
    }
}
