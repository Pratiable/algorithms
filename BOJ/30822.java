import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int[] arr = new int[5];

        for (int i = 0; i < n; i++) {
            char now = str.charAt(i);

            if (now == 'u') arr[0]++;
            else if (now == 'o') arr[1]++;
            else if (now == 's') arr[2]++;
            else if (now == 'p') arr[3]++;
            else if (now == 'c') arr[4]++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
