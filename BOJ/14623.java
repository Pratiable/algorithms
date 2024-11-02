import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine(), 2);
        BigInteger b = new BigInteger(br.readLine(), 2);

        System.out.println(a.multiply(b).toString(2));
    }
}