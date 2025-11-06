import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        for (int Y = X + 1; Y <= 9999; Y++) {
            if ((Y / 100 + Y % 100) * (Y / 100 + Y % 100) == Y) {
                System.out.print(Y);
                return;
            }
        }

        System.out.print(-1);
    }
}
