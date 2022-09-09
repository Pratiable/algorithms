import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int a = 0;
    	
    	while(true) {
    		int n = Integer.parseInt(br.readLine());
    		if (n == -1) break;
    		a += n;
    	}
    	
    	System.out.println(a);
	}
}