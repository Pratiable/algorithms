import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String std = br.readLine();
        String input;
        String str = "";
        while ((input = br.readLine()) != null) {
            str += input;
        }

        String[] split = str.split(std);

        System.out.println(split.length - 1);
    }
}