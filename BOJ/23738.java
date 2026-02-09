import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A': sb.append("a"); break;
                case 'B': sb.append("v"); break;
                case 'E': sb.append("ye"); break;
                case 'K': sb.append("k"); break;
                case 'M': sb.append("m"); break;
                case 'H': sb.append("n"); break;
                case 'O': sb.append("o"); break;
                case 'P': sb.append("r"); break;
                case 'C': sb.append("s"); break;
                case 'T': sb.append("t"); break;
                case 'Y': sb.append("u"); break;
                case 'X': sb.append("h"); break;
            }
        }

        System.out.print(sb);
    }
}
