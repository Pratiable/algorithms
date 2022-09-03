import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // Time
            if (x > 23 || y > 59) {
                sb.append("No ");
            } else {
                sb.append("Yes ");
            }

            // Date
            switch (x) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (y < 1 || y > 31) {
                        sb.append("No\n");
                        break;
                    }
                    sb.append("Yes\n");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (y < 1 || y > 30) {
                        sb.append("No\n");
                        break;
                    }
                    sb.append("Yes\n");
                    break;
                case 2:
                    if (y < 1 || y > 29) {
                        sb.append("No\n");
                        break;
                    }
                    sb.append("Yes\n");
                    break;
                default:
                    sb.append("No\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}