import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String a = br.readLine();
            String b = br.readLine();
            int dist = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    dist++;
                }
            }

            sb.append("Hamming distance is ").append(dist).append(".\n");
        }

        System.out.println(sb);
    }
}
