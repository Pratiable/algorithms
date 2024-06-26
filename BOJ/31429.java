import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                System.out.printf("%d %d", 12, 1600);
                break;
            case 2:
                System.out.printf("%d %d", 11, 894);
                break;
            case 3:
                System.out.printf("%d %d", 11, 1327);
                break;
            case 4:
                System.out.printf("%d %d", 10, 1311);
                break;
            case 5:
                System.out.printf("%d %d", 9, 1004);
                break;
            case 6:
                System.out.printf("%d %d", 9, 1178);
                break;
            case 7:
                System.out.printf("%d %d", 9, 1357);
                break;
            case 8:
                System.out.printf("%d %d", 8, 837);
                break;
            case 9:
                System.out.printf("%d %d", 7, 1055);
                break;
            case 10:
                System.out.printf("%d %d", 6, 556);
                break;
            case 11:
                System.out.printf("%d %d", 6, 773);
                break;
        }
    }
}