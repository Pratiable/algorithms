import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder and = new StringBuilder();
        StringBuilder or = new StringBuilder();
        StringBuilder xor = new StringBuilder();
        StringBuilder notA = new StringBuilder();
        StringBuilder notB = new StringBuilder();
        String A = br.readLine();
        String B = br.readLine();

        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);

            notA.append(a == '1' ? '0' : '1');
            notB.append(b == '1' ? '0' : '1');
            xor.append(a != b ? '1' : '0');
            and.append(a == '1' && b == '1' ? '1' : '0');
            or.append(a == '1' || b == '1' ? '1' : '0');
        }

        sb.append(and).append("\n");
        sb.append(or).append("\n");
        sb.append(xor).append("\n");
        sb.append(notA).append("\n");
        sb.append(notB).append("\n");

        System.out.print(sb);
    }
}
