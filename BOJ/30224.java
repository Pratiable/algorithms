import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);

        if (!str.contains("7") && n % 7 != 0) {
            System.out.println("0");
        } else if (!str.contains("7")) {
            System.out.println("1");
        } else if (n % 7 != 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}