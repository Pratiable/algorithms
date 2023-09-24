import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        String str = "WelcomeToSMUPC";
        System.out.println(str.charAt(n % 14 == 0 ? 13 : n % 14 - 1));
    }
}
