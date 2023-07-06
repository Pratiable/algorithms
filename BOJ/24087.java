import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = 250;

        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(s <= a) {
            System.out.println(price);
        }
        else {
            System.out.println(price + 100 * ((s - a + b - 1) / b));
        }
    }
}
