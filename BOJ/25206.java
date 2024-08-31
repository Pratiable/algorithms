import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> scores = new HashMap<>();
        scores.put("A+", 4.5);
        scores.put("A0", 4.0);
        scores.put("B+", 3.5);
        scores.put("B0", 3.0);
        scores.put("C+", 2.5);
        scores.put("C0", 2.0);
        scores.put("D+", 1.5);
        scores.put("D0", 1.0);
        scores.put("F", 0.0);

        double sumGrade = 0;
        double sumScore = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                sumGrade += score * scores.get(grade);
                sumScore += score;
            }
        }

        System.out.printf("%.6f", sumGrade / sumScore);
    }
}