import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int sock = Integer.parseInt(br.readLine());
            if (map.containsKey(sock)) {
                map.put(sock, map.get(sock) + 1);
                continue;
            }
            map.put(sock, 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                System.out.println(key);
                return;
            }
        }
    }
}