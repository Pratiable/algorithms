import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		int min = 101;
		
		for (int i = 0; i < 7; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a % 2 != 0) {
				sum += a;
				min = Math.min(min, a);
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(String.format("%d\n%d", sum, min));
		}
	}
}