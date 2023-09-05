import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int cnt = 0;

		if (n == 0) {
			System.out.println(0);
			return;
		}
		
        while (true) {
            if (n == 1) {
                System.out.println(cnt + 1);
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n /= 2;
                n++;
            }
            cnt++;
        }
    }
}