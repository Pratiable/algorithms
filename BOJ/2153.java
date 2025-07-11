import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (now >= 97 && now <= 122) {
                sum += now - 97 + 1;
            } else if (now >= 65 && now <= 90){
                sum += now - 65 + 27;
            }
        }

        System.out.println(isPrime(sum) ? "It is a prime word." : "It is not a prime word.");
    }

    static boolean isPrime(int n) {
        if (n == 1) return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}