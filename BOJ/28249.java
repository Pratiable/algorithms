import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Integer> map = new HashMap<>();
        map.put("Poblano", 1500);
        map.put("Mirasol", 6000);
        map.put("Serrano", 15500);
        map.put("Cayenne", 40000);
        map.put("Thai", 75000);
        map.put("Habanero", 125000);
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += map.get(br.readLine());
        }
        
        System.out.println(sum);
    }
}
