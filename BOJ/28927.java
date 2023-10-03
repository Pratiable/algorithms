import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        
        int max = a * 3 + b * 20 + c * 120;
        int mel = d * 3 + e * 20 + f * 120;

        if (max > mel) {
            System.out.println("Max");
        } else if (max < mel) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}
