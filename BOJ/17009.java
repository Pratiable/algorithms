import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int A = (a * 3) + (b * 2) + c;
        int B = (d * 3) + (e * 2) + f;

        System.out.println(A > B ? 'A' : A < B ? 'B' : 'T');
    }
}
