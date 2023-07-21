import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());
        
        if (year == 1996 || year == 1997 || year == 2000 || year == 2007 || year == 2008 || year == 2013 || year == 2018) {
            System.out.println("SPbSU");
        } else if (year == 2006) {
            System.out.println("PetrSU, ITMO");
        } else {
            System.out.println("ITMO");
        }
    }
}
