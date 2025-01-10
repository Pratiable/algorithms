import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums1 = new int[5];
        for (int i = 0; i < 5; i++) {
            nums1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] nums2 = new int[5];
        for (int i = 0; i < 5; i++) {
            nums2[i] = Integer.parseInt(st.nextToken());
        }

        boolean canDo = true;
        for (int i = 0; i < 5; i++) {
            if (nums1[i] == nums2[i]) {
                canDo = false;
                break;
            }
        }

        System.out.println(canDo ? "Y" : "N");
    }
}