import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	for (int i = 0; i < n; i++) {
    		sb.append("*".repeat(i + 1)).append("\n");
    	}
    	for (int i = 1; i < n; i++) {
    		sb.append("*".repeat(n - i)).append("\n");
    	}
    	
    	bw.append(sb);
    	bw.flush();
    	bw.close();
	}
}