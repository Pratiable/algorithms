import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if (str.equals("#")) break;
            String[] strs = str.split(" ");
            for (int i = 0; i < strs.length; i++) {
                StringBuffer sbf = new StringBuffer(strs[i]);
                sb.append(sbf.reverse()).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}