import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            double earthWeight = Double.parseDouble(br.readLine());
            if (earthWeight < 0) break;
            
            double moonWeight = earthWeight * 0.167;
            sb.append(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", earthWeight, moonWeight));
        }
        
        System.out.println(sb);
    }
}
