import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        double[] nums = new double[4];
        nums[0] = a / c + b / d;
        nums[1] = c / d + a / b;
        nums[2] = d / b + c / a;
        nums[3] = b / a + d / c;

        int idx = 0;
        for (int i = 1; i < 4; i++) {
            if (nums[i] > nums[idx]) {
                idx = i;
            }
        }

        System.out.println(idx);
    }
}
