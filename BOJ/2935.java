import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String C = br.readLine();
        String B = br.readLine();
        if (C.equals("*")) {
            System.out.println(A + "0".repeat(B.length() - 1));
        } else {
            if (A.length() == B.length()) {
                System.out.println("2" + "0".repeat(A.length() - 1));
            } else if(A.length() > B.length()){
                System.out.println("1" + "0".repeat(A.length() - B.length() - 1) + "1" + "0".repeat(B.length() - 1));
            } else {
                System.out.println("1" + "0".repeat(B.length() - A.length() - 1) + "1" + "0".repeat(A.length() - 1));
            }
        }
    }
}
