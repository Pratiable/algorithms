import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int roomCount = 0;

        int[][] students = new int[2][6];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken()) - 1;
            students[gender][grade] += 1;
        }

        for (int[] gen: students) {
            for (int student: gen) {
                if (student == 0) continue;
                roomCount += student % k == 0 ? student / k : (student / k) + 1;
            }
        }
        
        System.out.println(roomCount);
    }
}