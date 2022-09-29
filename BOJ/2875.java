import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int sum = n + m;
        int available = Math.min(n / 2, m);
        int leftStudents = sum - available * 3;
        if (k > leftStudents) {
            int notAvaliable = (k - leftStudents) % 3 == 0 ? (k - leftStudents) / 3 : ((k - leftStudents) / 3) + 1;
            int result = Math.max(available - notAvaliable, 0);
            System.out.println(result);
        } else {
            System.out.println(available);
        }
    }
}
