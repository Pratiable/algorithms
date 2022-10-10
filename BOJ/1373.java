import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int left = str.length() % 3;
        StringBuilder result = new StringBuilder();

        if (left == 1) {
            result.append(str.charAt(0));
        } else if (left == 2) {
            result.append(((str.charAt(0) - '0') * 2) + str.charAt(1) - '0');
        }

        for (int i = left; i < str.length(); i += 3){
            result.append(((str.charAt(i) - '0') * 4) + ((str.charAt(i + 1) - '0') * 2) + (str.charAt(i + 2) - '0'));
        }
        System.out.println(result);
    }
}