import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Objects.equals(br.readLine(), "0") ? "YONSEI" : "Leading the Way to the Future");
    }
}