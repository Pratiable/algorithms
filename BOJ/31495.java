import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.length() <= 1 || str.equals("\"\"")) {
            System.out.println("CE");
            return;
        }

        if (str.charAt(0) == '"' && str.charAt(str.length() - 1) == '"') {
            System.out.println(str.substring(1, str.length() - 1));
            return;
        }
        System.out.println("CE");
    }
}