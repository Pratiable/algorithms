import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());

        System.out.println((n.mod(new BigInteger("2")).equals(new BigInteger("0"))) ? "CY" : "SK");
    }
}