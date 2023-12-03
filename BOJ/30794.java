import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String cmd = st.nextToken();

        switch (cmd) {
            case "miss":
                System.out.println(0);
                return;
            case "bad":
                System.out.println(n * 200);
                return;
            case "cool":
                System.out.println(n * 400);
                return;
            case "great":
                System.out.println(n * 600);
                return;
            case "perfect":
                System.out.println(n * 1000);
        }
    }
}
