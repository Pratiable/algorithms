import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}