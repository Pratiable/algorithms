import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = "";
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name.contains("S")) {
                str = name;
                break;
            }
        }

        System.out.println(str);
    }
}