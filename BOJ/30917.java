import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        for (int a = 1; a < 10; a++) {
            System.out.println("? A " + a);
            int res = sc.nextInt();

            if (res == 1) {
                for (int b = 1; b < 10; b++) {
                    System.out.println("? B " + b);
                    int bRes = sc.nextInt();
                    if (bRes == 1) {
                        System.out.println("! " + (a + b));
                        return;
                    }
                }
            }
        }
    }
}