import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		System.out.println(new BigInteger(br.readLine()).multiply(new BigInteger(br.readLine())));
	}
}