import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.startsWith("0x")) {
            System.out.println(Integer.parseInt(str.substring(2), 16));
        } else if (str.startsWith("0") && str.length() > 1) {
            System.out.println(Integer.parseInt(str.substring(1), 8));
        } else {
            System.out.println(Integer.parseInt(str));
        }
    }
}