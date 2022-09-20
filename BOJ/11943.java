import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int appleA = Integer.parseInt(st.nextToken());
        int orangeA = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int appleB = Integer.parseInt(st.nextToken());
        int orangeB = Integer.parseInt(st.nextToken());
        
        if (appleA + orangeB > appleB + orangeA) {
            System.out.println(appleB + orangeA);
        } else {
            System.out.println(appleA + orangeB);
        }
    }
}