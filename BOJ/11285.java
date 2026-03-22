import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String mid = br.readLine();
        String last = br.readLine();
        int firstIdx = 0;
        int midIdx = 0;
        int lastIdx = 0;

        String[] firsts = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
        String[] mids = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
        String[] lasts = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};

        for (int i = 0; i < firsts.length; i++) {
            if (first.equals(firsts[i])) {
                firstIdx = i;
                break;
            }
        }

        for (int i = 0; i < mids.length; i++) {
            if (mid.equals(mids[i])) {
                midIdx = i;
                break;
            }
        }

        for (int i = 0; i < lasts.length; i++) {
            if (last.equals(lasts[i])) {
                lastIdx = i;
                break;
            }
        }

        System.out.print((char) (44032 + (firstIdx * 21 * 28) + (midIdx * 28) + lastIdx));
    }
}
