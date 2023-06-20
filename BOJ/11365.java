import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("END")) {
                break;
            }

            StringBuilder sb = new StringBuilder(str);
            result.append(sb.reverse()).append('\n');
        }
        
        System.out.println(result);
    }
}
