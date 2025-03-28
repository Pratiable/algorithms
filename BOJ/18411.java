import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[3];
        
        for (int i = 0; i < 3; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(scores);
        int sum = scores[1] + scores[2];
        
        System.out.println(sum);
    }
}
