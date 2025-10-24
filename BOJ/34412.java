import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x >= 13) {
            System.out.print(x + 1);
            return;
        }
        
        System.out.print(x);
    }
}
