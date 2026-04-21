package berribot;
import java.util.*;

public class Main {

    private Map<String, List<Integer>> map = new HashMap<>();

    // add record
    public void addRecord(String name, String subject, int score) {
//        if (!map.containsKey(name)) {
//            map.put(name, new ArrayList<>());
//        }
//        map.get(name).add(score);
        map.computeIfAbsent(name, k->new ArrayList<>()).add(score);
    }

    // class average
    public double getClassAverage() {
        if (map.isEmpty()) return -1.0;

        int total = 0, count = 0;

        for (List<Integer> list : map.values()) {
            for (int v : list) {
                total += v;
                count++;
            }
        }

        double avg = (double) total / count;
        return Math.round(avg * 10.0) / 10.0;
    }

    // top student (name + avg)
    public Object getTopStudent() {
        if (map.isEmpty()) return null;

        String bestName = null;
        double bestAvg = -1;

        for (String name : map.keySet()) {
            List<Integer> list = map.get(name);

            int sum = 0;
            for (int v : list) sum += v;

            double avg = (double) sum / list.size();

            if (avg > bestAvg) {
                bestAvg = avg;
                bestName = name;
            } else if (avg == bestAvg && name.compareTo(bestName) < 0) {
                bestName = name;
            }
        }

        double rounded = Math.round(bestAvg * 10.0) / 10.0;
        return Arrays.asList(bestName, rounded);
    }

    // main method
    public static void main(String[] args) {

        Main g = new Main();

        g.addRecord("Aman", "Math", 80);
        g.addRecord("Aman", "Science", 90);

        g.addRecord("Riya", "Math", 85);
        g.addRecord("Riya", "Science", 95);

        g.addRecord("Karan", "Math", 70);
        g.addRecord("Karan", "Science", 75);

        System.out.println(g.getClassAverage());   // 82.5
        System.out.println(g.getTopStudent());     // [Riya, 90.0]
    }
}
