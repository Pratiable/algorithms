import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine(), "/", false);
    	
    	int k = Integer.parseInt(st.nextToken());
    	int d = Integer.parseInt(st.nextToken());
    	int a = Integer.parseInt(st.nextToken());
    	
    	if(k + a < d || d == 0) {
    		bw.append("hasu");
    	} else {
    		bw.append("gosu");
    	}
    	
        bw.flush();
        bw.close();
    }
}