import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] codes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("A#", 1);
        map.put("Bb", 1);
        map.put("B", 2);
        map.put("Cb", 2);
        map.put("B#", 3);
        map.put("C", 3);
        map.put("C#", 4);
        map.put("Db", 4);
        map.put("D", 5);
        map.put("D#", 6);
        map.put("Eb", 6);
        map.put("E", 7);
        map.put("Fb", 7);
        map.put("E#", 8);
        map.put("F", 8);
        map.put("F#", 9);
        map.put("Gb", 9);
        map.put("G", 10);
        map.put("G#", 11);
        map.put("Ab", 11);

        while (true) {
            String str = br.readLine();
            if (str.equals("***")) break;
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(str);
            List<String> moved = new ArrayList<>();

            while (st.hasMoreTokens()) {
                String cur = st.nextToken();
                int idx = map.get(cur);
                int move = (idx + k) % 12;
                if (move < 0) move += 12;
                moved.add(codes[move]);
            }

            for (int i = 0; i < moved.size(); i++) {
                if (i > 0) sb.append(" ");
                sb.append(moved.get(i));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
