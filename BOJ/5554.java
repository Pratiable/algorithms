import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int t = 0;
    	
    	t += Integer.parseInt(br.readLine());
    	t += Integer.parseInt(br.readLine());
    	t += Integer.parseInt(br.readLine());
    	t += Integer.parseInt(br.readLine());
    	
    	bw.append(String.valueOf(t / 60)).append("\n").append(String.valueOf(t % 60));
        
        bw.flush();
        bw.close();
    }
}