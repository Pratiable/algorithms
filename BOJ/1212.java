import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] octNum = br.readLine().split("");

        sb.append(Integer.toBinaryString(Integer.parseInt(octNum[0])));

        for (int i = 1; i < octNum.length; i++) {
            int num = Integer.parseInt(octNum[i]);
            if (num <= 1) {
                sb.append("00").append(Integer.toBinaryString(num));
            } else if (num <= 3) {
                sb.append("0").append(Integer.toBinaryString(num));
            } else {
                sb.append(Integer.toBinaryString(num));
            }
        }

        System.out.println(sb);
    }
}