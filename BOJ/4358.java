import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;

        while ((str = br.readLine()) != null) {
            cnt++;
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
                list.add(str);
            }
        }

        list.sort(Comparator.naturalOrder());

        for (String tree : list) {
            sb.append(tree).append(" ").append(String.format("%.4f", (double) map.get(tree) * 100 / cnt)).append("\n");
        }

        System.out.println(sb);
    }
}