import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
    		int d = Integer.parseInt(st.nextToken());
    		int available = 0;
    		for (int j = 0; j < n; j++) {
    			st = new StringTokenizer(br.readLine());
    			int v = Integer.parseInt(st.nextToken());
    			int f = Integer.parseInt(st.nextToken());
    			int c = Integer.parseInt(st.nextToken());
    			double r = f / (double) c;
    			if (v * r >= d) {
    				available += 1;
    			}
    		}
    		sb.append(String.valueOf(available)).append("\n");
    	}
    	
    	bw.append(sb);
    	bw.flush();
    	bw.close();
	}
}