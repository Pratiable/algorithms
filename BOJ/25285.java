import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double height = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            double bmi = weight / ((height / 100.0) * (height / 100.0));

            if (height < 140.1) {
                sb.append(6).append("\n");
            } else if (height < 146) {
                sb.append(5).append("\n");
            } else if (height < 159) {
                sb.append(4).append("\n");
            } else if (height < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    sb.append(3).append("\n");
                } else {
                    sb.append(4).append("\n");
                }
            } else if (height < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    sb.append(1).append("\n");
                } else if ((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0)) {
                    sb.append(2).append("\n");
                } else if ((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0)) {
                    sb.append(3).append("\n");
                } else {
                    sb.append(4).append("\n");
                }
            } else {
                sb.append(4).append("\n");
            }
        }

        System.out.println(sb);
    }
}