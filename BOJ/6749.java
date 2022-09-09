import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int x = Integer.parseInt(br.readLine());
    	int y = Integer.parseInt(br.readLine());
    	
    	System.out.println(y + (y - x));
	}
}