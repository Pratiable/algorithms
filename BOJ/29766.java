import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String dksh = "DKSH";

        System.out.println(str.split(dksh, -1).length - 1);
    }
}