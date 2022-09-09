import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int x = L * P;
        
    	st = new StringTokenizer(br.readLine());
    	
    	while(st.hasMoreTokens()){
    		int y = Integer.parseInt(st.nextToken());
    		
    		bw.append(String.valueOf(y - x)).append(" ");
    	}
        
        bw.flush();
        bw.close();
    }
}