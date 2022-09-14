import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        map.put("-",0);
        map.put("\\",1);
        map.put("(",2);
        map.put("@",3);
        map.put("?",4);
        map.put(">",5);
        map.put("&",6);
        map.put("%",7);
        map.put("/",-1);
        while (true) {
            String str = br.readLine();
            if (Objects.equals("#", str)) break;
            List<String> octNum = new ArrayList<>(Arrays.asList(str.split("")));
            Collections.reverse(octNum);

            int sum = 0;
            for (int i = 0; i < octNum.size(); i++) {
                sum += map.get(octNum.get(i)) * (int) Math.pow(8, i);
            }

            bw.append(String.valueOf(sum)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}