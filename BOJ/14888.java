import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    static int n, min, max, a, b, c, d;
    public static int[] nums;
    static int[] operators;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        min = 1000000000;
        max = -1000000000;
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        operators = new int[4];
        operators[0] = a;
        operators[1] = b;
        operators[2] = c;
        operators[3] = d;

        make(nums[0],0);

        System.out.println(max);
        System.out.println(min);
    }

    public static void make(int num, int depth) {
        if (depth == n - 1) {
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }

        if (operators[0] > 0) {
            operators[0]--;
            make(num + nums[depth + 1], depth + 1);
            operators[0]++;
        }

        if (operators[1] > 0) {
            operators[1]--;
            make(num - nums[depth + 1], depth + 1);
            operators[1]++;
        }

        if (operators[2] > 0) {
            operators[2]--;
            make(num * nums[depth + 1], depth + 1);
            operators[2]++;
        }

        if (operators[3] > 0) {
            operators[3]--;
            make(num / nums[depth + 1], depth + 1);
            operators[3]++;
        }

    }
}