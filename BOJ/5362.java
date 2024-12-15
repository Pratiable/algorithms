import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            str = str.replace("iiing", "th");
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}

