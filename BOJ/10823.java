import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String str;
        String nums = "";

        while ((str = br.readLine()) != null) {
            nums += str;
        }

        StringTokenizer st = new StringTokenizer(nums, ",");

        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.print(sum);
    }
}
