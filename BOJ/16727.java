import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        
        int totalP = p1 + p2;
        int totalS = s1 + s2;
        
        boolean isPersepolisWin = totalP > totalS || (totalP == totalS && p2 > s1);
        boolean isEsteghlalWin = totalP < totalS || (totalP == totalS && p2 < s1);
        
        System.out.println(isPersepolisWin ? "Persepolis" : isEsteghlalWin ? "Esteghlal" : "Penalty");
    }
}
