import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>(Arrays.asList("C", "A", "M", "B", "R", "I", "D", "G", "E"));
        String[] s = br.readLine().split("");

        for (String c : s) {
            if (!list.contains(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}