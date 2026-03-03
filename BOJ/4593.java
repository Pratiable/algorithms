import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String p1 = br.readLine();
            String p2 = br.readLine();
            int p1Cnt = 0;
            int p2Cnt = 0;

            if (p1.equals("E") && p2.equals("E")) break;

            for (int i = 0; i < p1.length(); i++) {
                char a = p1.charAt(i);
                char b = p2.charAt(i);

                if (a == b) continue;

                if ((a == 'R' && b == 'S') || (a == 'S' && b == 'P') || (a == 'P' && b == 'R')) {
                    p1Cnt++;
                } else {
                    p2Cnt++;
                }
            }

            sb.append("P1: ").append(p1Cnt).append("\n");
            sb.append("P2: ").append(p2Cnt).append("\n");
        }

        System.out.print(sb);
    }
}
