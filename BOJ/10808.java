import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        List<Character> alphabets = new ArrayList<>(26);
        String[] count = new String[26];
        for (int i = 97; i < 123; i++) {
            alphabets.add((char) i);
        }

        for (int i = 0; i < alphabets.size(); i++) {
            count[i] = countChar(str, alphabets.get(i));
        }

        System.out.println(String.join(" ", count));


        bw.flush();
        bw.close();
    }

    public static String countChar(String str, char ch) {
        int count = 0;

        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == ch) {
                count++;
            }
        }
        return String.valueOf(count);
    }
}