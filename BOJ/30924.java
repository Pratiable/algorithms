import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        while (true) {
            int a = (int) (Math.random() * 10000 + 1);
            if (aSet.contains(a)) continue;
            aSet.add(a);
            System.out.println("? A " + a);
            String aRes = br.readLine();

            if (aRes.equals("1")) {
                while (true) {
                    int b = (int) (Math.random() * 10000 + 1);
                    if (bSet.contains(b)) continue;
                    bSet.add(b);
                    System.out.println("? B " + b);
                    String bRes = br.readLine();
                    if (bRes.equals("1")) {
                        System.out.println("! " + (a + b));
                        return;
                    }
                }
            }
        }
    }
}