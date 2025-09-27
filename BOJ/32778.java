import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int subIdx = str.indexOf("(");

        if (subIdx == -1) {
            System.out.println(str);
            System.out.println("-");
            return;
        }

        String name = str.substring(0, subIdx - 1);
        String subName = str.substring(subIdx + 1, str.length() - 1);
        System.out.println(name);
        System.out.println(subName);
    }
}
