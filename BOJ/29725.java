import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> s = new HashMap<>();
        s.put('K', 0);
        s.put('k', 0);
        s.put('P', 1);
        s.put('p', -1);
        s.put('N', 3);
        s.put('n', -3);
        s.put('B', 3);
        s.put('b', -3);
        s.put('R', 5);
        s.put('r', -5);
        s.put('Q', 9);
        s.put('q', -9);
        s.put('.', 0);

        int res = 0;
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                res += s.get(str.charAt(j));
            }
        }

        System.out.println(res);
    }
}
