import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0;;i++) {
            int now = ((i + 1) * (i + 2)) / 2;
            if (now > 1000) break;
            list.add(now);
        }

        for (int l = 0; l < N; l++) {
            int m = Integer.parseInt(br.readLine());
            boolean isAvailable = false;
            Loop:
            for (int i = 0; i < list.size(); i++){
                for (int j = 0; j < list.size(); j++){
                    for (int k = 0; k < list.size(); k++){
                        if (list.get(i) + list.get(j) + list.get(k) == m) {
                            isAvailable = true;
                            break Loop;
                        }
                    }
                }
            }
            if (isAvailable) bw.append(String.valueOf(1)).append("\n");
            else bw.append(String.valueOf(0)).append("\n");
        }

        bw.flush();
        bw.close();
    }
}