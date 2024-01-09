import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        switch (str) {
            case "M":
                System.out.println("MatKor");
                return;
            case "W":
                System.out.println("WiCys");
                return;
            case "C":
                System.out.println("CyKor");
                return;
            case "A":
                System.out.println("AlKor");
                return;
            default:
                System.out.println("$clear");
        }
    }
}