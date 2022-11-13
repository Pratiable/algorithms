import java.io.*;
import java.util.*;

public class Main {
    public static int l;
    public static int c;
    public static char[] vowels;
    public static char[] alphabets;
    public static char[] result;
    public static boolean[] visited;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        visited = new boolean[26];
        alphabets = new char[c];
        result = new char[l];
        st = new StringTokenizer(br.readLine());
        vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < c; i++) {
            alphabets[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alphabets);
        make(0, -1, 0);

        System.out.println(sb);
    }

    public static void make(int count, int lastCh, int vowelCount) {
        if (count == l) {
            if (l - vowelCount > 1 && vowelCount > 0) {
                for (char ch: result) {
                    sb.append(ch);
                }
                sb.append("\n");
            }
            return;
        }

        for (int j = 0; j < alphabets.length; j++) {
            if (alphabets[j] - 'a' <= lastCh) continue;
            result[count] = alphabets[j];
            if (checkVowel(alphabets[j])) {
                make(count + 1, alphabets[j] - 'a', vowelCount + 1);
            } else {
                make(count + 1, alphabets[j] - 'a', vowelCount);
            }
        }
    }

    public static boolean checkVowel(char ch) {
        for (int k = 0; k < vowels.length; k++) {
            if (vowels[k] == ch) return true;
        }
        return false;
    }
}