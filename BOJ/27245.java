import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double w = Double.parseDouble(br.readLine());
        double l = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        double min = Math.min(w, l);
        double max = Math.max(w, l);

        if (min >= h * 2 && max <= min * 2) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}