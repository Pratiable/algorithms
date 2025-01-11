import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean isSampleWrong = false;
        boolean isSystemWrong = false;

        for (int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            long ans = Long.parseLong(st.nextToken());
            long output = Long.parseLong(st.nextToken());
            if (ans != output) isSampleWrong = true;
        }

        for (int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            long ans = Long.parseLong(st.nextToken());
            long output = Long.parseLong(st.nextToken());
            if (ans != output) isSystemWrong = true;
        }

        if (isSampleWrong) {
            System.out.println("Wrong Answer");
        } else if (isSystemWrong) {
            System.out.println("Why Wrong!!!");
        } else {
            System.out.println("Accepted");
        }
    }
}
