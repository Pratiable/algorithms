import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        
        boolean isTelemarketer = (a == 8 || a == 9) && (d == 8 || d == 9) && (b == c);
        
        if (isTelemarketer) {
            System.out.println("ignore");
            return;
        }
        System.out.println("answer");
    }
}
