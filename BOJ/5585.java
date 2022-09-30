import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] changeArr = new int[] {500, 100, 50, 10, 5, 1};
        int changeCount = 0;
        int change = 1000 - n;

        for (int coin : changeArr) {
            if (change == 0) break;
            changeCount += change / coin;
            change = change % coin;
        }

        System.out.println(changeCount);
    }
}
