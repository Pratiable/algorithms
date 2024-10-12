import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.substring(0, str.length() / 2) + " " + str.substring(str.length() / 2));
    }
}
