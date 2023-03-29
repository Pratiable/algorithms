import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		long lt, wt, le, we;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			lt = Long.parseLong(st.nextToken());
			wt = Long.parseLong(st.nextToken());
			le = Long.parseLong(st.nextToken());
			we = Long.parseLong(st.nextToken());
			if (lt * wt == le * we) {
				System.out.println("Tie");
                continue;
			} else if (lt * wt > le * we) {
				System.out.println("TelecomParisTech");
                continue;
            }
			System.out.println("Eurecom");
		}
	}	
}