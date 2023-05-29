import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        if (b <= a) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int c = b - a;
            if (c <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            } else if (c <= 30) {
                System.out.println("You are speeding and your fine is $270.");
            } else {
                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}
