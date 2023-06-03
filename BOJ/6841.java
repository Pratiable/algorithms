import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        map.put("CU", "see you");
        map.put(":-)", "I’m happy");
        map.put(":-(", "I’m unhappy");
        map.put(";-)", "wink");
        map.put(":-P", "stick out my tongue");
        map.put("(~.~)", "sleepy");
        map.put("TA", "totally awesome");
        map.put("CCC", "Canadian Computing Competition");
        map.put("CUZ", "because");
        map.put("TY", "thank-you");
        map.put("YW", "you’re welcome");
        map.put("TTYL", "talk to you later");

        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str = br.readLine();
            String now = map.getOrDefault(str, str);
            sb.append(now).append("\n");
            if ("TTYL".equals(str)) {
                break;
            }
        }

        System.out.println(sb);
    }
}
