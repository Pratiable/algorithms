import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer aCard = new StringTokenizer(br.readLine());
        StringTokenizer bCard = new StringTokenizer(br.readLine());
        int aScore = 0;
        int bScore = 0;

        while (aCard.hasMoreTokens()) {
            int aNow = Integer.parseInt(aCard.nextToken());
            int bNow = Integer.parseInt(bCard.nextToken());

            if (aNow > bNow) {
                aScore++;
            } else if (aNow < bNow) {
                bScore++;
            }
        }
        System.out.println(aScore > bScore ? "A" : aScore < bScore ? "B" : "D");
    }
}