import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final String asc = "1 2 3 4 5 6 7 8";
        final String desc = "8 7 6 5 4 3 2 1";
        String str = br.readLine();

        System.out.println(Objects.equals(str, asc) ? "ascending" : Objects.equals(str, desc) ? "descending" : "mixed");
    }
}