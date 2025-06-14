import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        StringBuilder sb;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            sb = new StringBuilder();
            for (int j = i; j < length; j++) {
                sb.append(str.charAt(j));
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());
    }
}
