import java.io.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger x = new BigInteger(br.readLine());
        BigInteger y = new BigInteger(br.readLine());
        BigInteger two = new BigInteger("2");
        
        BigInteger a = (x.subtract(y)).divide(two).add(y);
        BigInteger b = (x.subtract(y)).divide(two);
        
        System.out.println(a);
        System.out.println(b);
    }

}
