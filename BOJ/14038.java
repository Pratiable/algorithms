import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        for (int i = 0; i < 6; i++) {
            String result = br.readLine();
            if (result.equals("W")) {
                cnt++;
            }
        }
        
        System.out.println(cnt >= 5 ? 1 : cnt >= 3 ? 2 : cnt >= 1 ? 3 : -1);
    }
}
