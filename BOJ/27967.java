import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().trim().toCharArray();

        int right = 0;
        int left = 0;
        int g = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '(') {
                left++;
            } else if (chars[i] == ')') {
                right++;
            } else {
                g++;
            }
        }


        int gpos = right > left ? 1 : left > right ? 2 : 0;
        int rg = 0;
        int lg = 0;

        if (gpos == 1) {
            lg = right - left + (g - (right - left)) / 2;
            rg = g - lg;
        } else if (gpos == 2) {
            rg = left - right + (g - (left - right)) / 2;
            lg = g - rg;
        } else {
            rg = lg = g / 2;
        }

        for (int i = 0; i < n; i++) {
            if (chars[i] == 'G') {
                chars[i] = lg-- > 0 ? '(' : ')';
            }
        }

        System.out.println(String.valueOf(chars));

    }
}