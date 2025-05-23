import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken(), 2);
        BigInteger b = new BigInteger(st.nextToken(), 2);

        System.out.println(a.add(b).toString(2));
    }
}