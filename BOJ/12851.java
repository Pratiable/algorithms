import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int cnt = 0;
    	boolean[] map = new boolean[100_001];
    	
    	Queue<int[]> queue = new LinkedList<>();
    	
    	queue.add(new int[]{n, 0});
    	
    	if (n == k) {
    		System.out.println("0\n1");
    		return;
    	}
    	
    	while (!queue.isEmpty()) {
    		int[] now = queue.poll();
    		
    		if (now[0] == k) {
    			if (min == now[1]) {
    				cnt++;
    			} else if (min > now[1]) {
    				cnt = 1;
    				min = now[1];
    			}
    			continue;
    		}
    		
    		map[now[0]] = true;
    	
    		
    		if (now[0] > 0 && !map[now[0] - 1]) {
    			queue.add(new int[]{now[0] - 1, now[1] + 1});
    		}
    		
    		if (now[0] < 100_000 && !map[now[0] + 1]) {
    			queue.add(new int[]{now[0] + 1, now[1] + 1});
    		}
    		
    		if (now[0] < 50_001 && !map[now[0] * 2]) {
    			queue.add(new int[]{now[0] * 2, now[1] + 1});
    		}
    	}
    	
        System.out.println(min);
        System.out.println(cnt);
    }
}
