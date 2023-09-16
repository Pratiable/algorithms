import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double x = Double.parseDouble(st.nextToken());

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.50);
        map.put("A0", 4.00);
        map.put("B+", 3.50);
        map.put("B0", 3.00);
        map.put("C+", 2.50);
        map.put("C0", 2.00);
        map.put("D+", 1.50);
        map.put("D0", 1.00);
        map.put("F", 0.00);

        Map<Double, String> rMap = new HashMap<>();
        rMap.put(4.50, "A+");
        rMap.put(4.00, "A0");
        rMap.put(3.50, "B+");
        rMap.put(3.00, "B0");
        rMap.put(2.50, "C+");
        rMap.put(2.00, "C0");
        rMap.put(1.50, "D+");
        rMap.put(1.00, "D0");
        rMap.put(0.00, "F");


        double[] points = {0.00, 1.00, 1.50, 2.00, 2.50, 3.00, 3.50, 4.00, 4.50};

        double sum = 0.00;
        double cSum = 0.00;

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            double hp = Double.parseDouble(st.nextToken());
            String gp = st.nextToken();
            sum += hp * map.get(gp);
            cSum += hp;
        }

        double target = Double.parseDouble(br.readLine());
        cSum += target;

        for (int i = 0; i < points.length; i++) {
            BigDecimal cal = BigDecimal.valueOf(sum).add(BigDecimal.valueOf(target).multiply(BigDecimal.valueOf(points[i])));
            BigDecimal result = cal.divide(BigDecimal.valueOf(cSum), 10, RoundingMode.HALF_UP);

            BigDecimal r = result.setScale(2, RoundingMode.FLOOR);

            if (r.doubleValue() > x) {
                System.out.println(rMap.get(points[i]));
                return;
            }
        }

        System.out.println("impossible");
    }
}
