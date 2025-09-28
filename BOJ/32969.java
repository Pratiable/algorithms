import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        System.out.println(s.contains("bigdata") || s.contains("public") || s.contains("society") ? "public bigdata" : "digital humanities");
    }
}
