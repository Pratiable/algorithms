import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('E', 'I');
        map.put('I', 'E');
        map.put('S', 'N');
        map.put('N', 'S');
        map.put('T', 'F');
        map.put('F', 'T');
        map.put('J', 'P');
        map.put('P', 'J');

        for (int i = 0; i < str.length(); i++) {
            sb.append(map.get(str.charAt(i)));
        }

        System.out.println(sb);
    }
}
