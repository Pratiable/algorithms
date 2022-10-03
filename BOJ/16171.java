import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");
        String keyword = br.readLine();

        StringBuilder filteredStr = new StringBuilder();

        for (String s : str) {
            boolean isNumeric = isNumericString(s);
            if (!isNumeric) {
                filteredStr.append(s);
            }
        }
        
        System.out.println(filteredStr.toString().contains(keyword) ? 1 : 0);
    }

    public static boolean isNumericString(String ch) {
        try {
            Integer.parseInt(ch);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}