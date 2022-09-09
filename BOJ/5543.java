import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int h, m, l, coke, sprite, min;
        
        h = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        l = Integer.parseInt(br.readLine());
        coke = Integer.parseInt(br.readLine());
        sprite = Integer.parseInt(br.readLine());
        min = 10000;
        
        int[] burgers = {h, m, l};
        int[] beverage = {coke, sprite};
		
		for (int s: burgers) {
			for (int b: beverage) {
				min = Math.min(s + b - 50, min);
			}
		}       
        bw.append(String.valueOf(min));
        
        bw.flush();
        bw.close();
    }
}