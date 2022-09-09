import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = Integer.parseInt(st.nextToken());
        int subtract = Integer.parseInt(st.nextToken());
        int w, l;
        
		if ((sum - subtract) % 2 != 0 || subtract > sum) {
			bw.append("-1");
		} else {
			l = (sum - subtract) / 2;
			w = sum - l;
			bw.append(String.format("%d %d", w, l));
		}
        
        
        bw.flush();
        bw.close();
    }
}


/*
sum = x + y
subtract = x - y

x = sum - y
x = subtract + y
sum - y = subtract + y

2y = sum - subtract
*/