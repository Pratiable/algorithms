import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            if (br.readLine().contains("FBI")) {
                list.add(String.valueOf(i));
            }
        }

        if (list.size() == 0) {
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(String.join(" ", list));
        }
    }
}