import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double w = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        double bmi = w / (h * h);
        
        System.out.println(bmi > 25 ? "Overweight" : bmi >= 18.5 ? "Normal weight" : "Underweight");
    }
}
