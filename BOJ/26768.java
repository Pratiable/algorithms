import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a':
                    sb.append('4');
                    break;

                case 'e':
                    sb.append('3');
                    break;

                case 'i':
                    sb.append('1');
                    break;

                case 'o':
                    sb.append('0');
                    break;

                case 's':
                    sb.append('5');
                    break;

                default:
                    sb.append(ch);
                    break;
            }
        }

        System.out.print(sb);
    }
}