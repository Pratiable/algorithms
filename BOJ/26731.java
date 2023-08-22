import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        for (int i = 65; i <= 90; i++) {
            if (str.indexOf((char)i) == -1) {
                System.out.println((char)i);
                break;
            }
        }
    }
}