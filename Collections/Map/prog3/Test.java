import java.util.*;

public class Test {
    public static void main(String[] args) {

        Properties stateCapitalMap = new Properties();

        stateCapitalMap.setProperty("West Bengal", "Kolkata");
        stateCapitalMap.setProperty("Maharashtra", "Mumbai");
        stateCapitalMap.setProperty("Tamil Nadu", "Chennai");
        stateCapitalMap.setProperty("Karnataka", "Bengaluru");
        stateCapitalMap.setProperty("Uttar Pradesh", "Lucknow");
        stateCapitalMap.setProperty("Rajasthan", "Jaipur");

        System.out.println("States and their Capitals:\n");

        Iterator<Map.Entry<Object, Object>> itr = stateCapitalMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Object, Object> entry = itr.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
