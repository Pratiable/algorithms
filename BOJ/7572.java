import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int year = Integer.parseInt(br.readLine());
        int calYear = year <= 3 ? 57 + year : year - 3;

        int ten = calYear % 10 == 0 ? 9 : (calYear % 10) - 1;
        int twelve = calYear % 12 == 0 ? 11 : (calYear % 12) - 1;
        char twelveToChar = (char) ((char) 65 + twelve);

        System.out.printf("%c%d", twelveToChar, ten);
    }
}
