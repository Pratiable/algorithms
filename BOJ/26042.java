import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxLine = 0;
        int lastStudentNo = Integer.MAX_VALUE;
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int studentNum = Integer.parseInt(st.nextToken());
                queue.add(studentNum);
                
                if (queue.size() > maxLine) {
                    maxLine = queue.size();
                    lastStudentNo = studentNum;
                } else if (queue.size() == maxLine) {
                    lastStudentNo = Math.min(studentNum, lastStudentNo);
                }
            } else if (type == 2) {
                queue.poll();
            }
        }
        
        System.out.printf("%d %d", maxLine, lastStudentNo);
    }
}