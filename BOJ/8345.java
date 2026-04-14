import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);

            if ("`1234567890-=~!@#$%^&*()_+".indexOf(cur) >= 0) {
                sb.append("1");
            } else if ("qwertyuiop[]\\QWERTYUIOP{}|".indexOf(cur) >= 0) {
                sb.append("2");
            } else if ("asdfghjkl;'ASDFGHJKL:\"".indexOf(cur) >= 0) {
                sb.append("3");
            } else if ("zxcvbnm,./ZXCVBNM<>?".indexOf(cur) >= 0) {
                sb.append("4");
            } else {
                sb.append("5");
            }
        }

        System.out.print(sb);
    }
}
