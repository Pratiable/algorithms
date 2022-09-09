import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long a = Long.parseLong(st.nextToken());
    	long b = Long.parseLong(st.nextToken());
    	long chicken = Long.parseLong(br.readLine());
    	
    	if(a + b >= chicken * 2) {
    		bw.append(String.valueOf(a + b - chicken * 2));	
    	} else {
    		bw.append(String.valueOf(a + b));
    	}
    	
        bw.flush();
        bw.close();
    }
}