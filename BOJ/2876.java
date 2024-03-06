import java.io.*;
import java.util.*;

public class Main {
    static int n, max, grade;
    static int[][] students;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        students = new int[n][2];

        dp = new int[n][2];
        max = 0;
        grade = 6;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            students[i][0] = Integer.parseInt(st.nextToken());
            students[i][1] = Integer.parseInt(st.nextToken());
        }

        dp[0][0] = 1;
        dp[0][1] = 1;

        for (int i = 1; i < n; i++) {
            if (students[i][0] == students[i - 1][0]) {
                dp[i][0] = dp[i - 1][0] + 1;
            } else if (students[i][0] == students[i - 1][1]) {
                dp[i][0] = dp[i - 1][1] + 1;
            } else {
                dp[i][0] = 1;
            }

            if (students[i][1] == students[i - 1][0]) {
                dp[i][1] = dp[i - 1][0] + 1;
            } else if (students[i][1] == students[i - 1][1]) {
                dp[i][1] = dp[i - 1][1] + 1;
            } else {
                dp[i][1] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (max <= dp[i][0]) {
                if (max == dp[i][0]) {
                    if (grade > students[i][0]) {
                        grade = students[i][0];
                    }
                } else {
                    max = dp[i][0];
                    grade = students[i][0];
                }
            }

            if (max <= dp[i][1]) {
                if (max == dp[i][1]) {
                    if (grade > students[i][1]) {
                        grade = students[i][1];
                    }
                } else {
                    max = dp[i][1];
                    grade = students[i][1];
                }
            }
        }

        System.out.printf("%d %d", max, grade);
    }
}