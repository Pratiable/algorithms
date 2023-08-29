import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String o = br.readLine();
        String e = br.readLine();

        boolean isUnchanged = n % 2 == 0;

        for (int i = 0; i < o.length(); i++) {
            if (isUnchanged != (o.charAt(i) == e.charAt(i))) {
                System.out.println("Deletion failed");
                return;
            }
        }
        System.out.println("Deletion succeeded");
    }
}