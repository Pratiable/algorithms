import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] multi = {6, 3, 2, 1, 2};
        int visitingScore = 0;
        int homeScore = 0;
        
        String[] visitingInput = br.readLine().split(" ");
        String[] homeInput = br.readLine().split(" ");
        
        for (int i = 0; i < 5; i++) {
            visitingScore += Integer.parseInt(visitingInput[i]) * multi[i];
            homeScore += Integer.parseInt(homeInput[i]) * multi[i];
        }
        
        System.out.println(visitingScore + " " + homeScore);
    }
}
