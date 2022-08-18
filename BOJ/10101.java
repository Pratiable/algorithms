import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> iSet = new HashSet<Integer>();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        iSet.add(a);
        iSet.add(b);
        iSet.add(c);
        if (a + b + c != 180) {
            System.out.println("Error");
        } else if (iSet.size() == 1) {
            System.out.println("Equilateral");
        } else if (iSet.size() == 2) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
