import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int idx = 0;

        while (true) {
            int start = str.indexOf("What is", idx);
            if (start == -1) break;

            int question = str.indexOf("?", start);
            int dot = str.indexOf(".", start);

            if (question != -1 && (dot == -1 || question < dot)) {
                sb.append("Forty-two").append(str, start + 4, question).append(".\n");
                idx = question + 1;
            } else {
                idx = dot == -1 ? start + 7 : dot + 1;
            }
        }

        System.out.print(sb);
    }
}
