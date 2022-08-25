import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        List<String> checkList = new ArrayList<>();

        while ((input = br.readLine()) != null) {
            checkList.add(input);
        }

        for (int i = 1; i < 31; i++) {
            if(checkList.contains(String.valueOf(i))){
                continue;
            }
            System.out.println(i);
        }
    }
}