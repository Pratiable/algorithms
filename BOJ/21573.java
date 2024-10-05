import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int now = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int res = now;

        switch (str) {
            case "freeze":
                if (now > target) {
                    res = target;
                }
                break;
            case "heat":
                if (now < target) {
                    res = target;
                }
                break;
            case "auto":
                res = target;
                break;
            default:
                break;
        }
        
        System.out.println(res);
    }
}
