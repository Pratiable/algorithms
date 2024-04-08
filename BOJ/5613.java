import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());

        while (true) {
            String str = br.readLine();

            switch (str) {
                case "+":
                    r += Integer.parseInt(br.readLine());
                    break;
                case "-":
                    r -= Integer.parseInt(br.readLine());
                    break;
                case "*":
                    r *= Integer.parseInt(br.readLine());
                    break;
                case "/":
                    r /= Integer.parseInt(br.readLine());
                    break;
                case "=":
                    System.out.println(r);
                    return;
            }
        }
    }
}