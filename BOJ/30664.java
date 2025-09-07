import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            BigInteger n = new BigInteger(str);

            sb.append(n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO) ? "PREMIADO\n" : "TENTE NOVAMENTE\n");
        }

        System.out.println(sb);
    }
}
