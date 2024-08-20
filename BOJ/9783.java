import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(String.format("%02d", c - 'a' + 1));
            } else if (Character.isUpperCase(c)) {
                sb.append(c - 'A' + 27);
            } else if (Character.isDigit(c)) {
                sb.append("#").append(c);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}