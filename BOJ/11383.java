import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] nums1 = new String[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = br.readLine();
        }

        String[] nums2 = new String[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                char c = nums1[i].charAt(j);
                sb.append(c).append(c);
            }
            if (!sb.toString().equals(nums2[i])) {
                System.out.println("Not Eyfa");
                return;
            }
        }

        System.out.println("Eyfa");
    }
}
