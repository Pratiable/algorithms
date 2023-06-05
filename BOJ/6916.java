import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		switch (n) {
            case 0:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println();
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 1:
                System.out.println();
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println();
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 2:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                break;
            case 3:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
            case 4:
                System.out.println();
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 5:
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
            case 6:
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 7:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println();
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 8:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 9:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
        }
    }
}