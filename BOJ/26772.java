import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] strs = {
                " @@@   @@@  ",
                "@   @ @   @ ",
                "@    @    @ ",
                "@         @ ",
                " @       @  ",
                "  @     @   ",
                "   @   @    ",
                "    @ @     ",
                "     @      "
        };

        for (String str : strs) {
            sb.append((str).repeat(n)).append("\n");
        }

        System.out.println(sb);
    }
}