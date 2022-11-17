import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ppl = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String replaced = str.replaceAll("LL", "S");
        System.out.println(Math.min(ppl, replaced.length() + 1));
    }
}
