import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		
		if (((a * b) / c) > ((a / b) * c)) {
			System.out.println((int) ((a * b) / c));
            return;
		}
        
        System.out.println((int) ((a / b) * c));
    }
}