import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 0;

        for (int i = 0; i < 3; i++) {
            String now = br.readLine();
            if (now.equals("Fizz") || now.equals("Buzz") || now.equals("FizzBuzz")) continue;
            target = Integer.parseInt(now) + 3 - i;
            break;
        }

        if (target % 3 == 0 && target % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (target % 3 == 0) {
            System.out.println("Fizz");
        } else if (target % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(target);
        }
    }
}
