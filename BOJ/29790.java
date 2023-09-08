import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        boolean isOverBOJ = n >= 1000;
        boolean isOverUnion = u >= 8000;
        boolean isOverLevel = l >= 260;
        
        if (isOverBOJ && (isOverUnion || isOverLevel)) {
            System.out.println("Very Good");
        } else if (isOverBOJ) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
