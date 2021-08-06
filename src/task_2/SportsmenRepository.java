package task_2;

import java.util.HashMap;
import java.util.Map;

public class SportsmenRepository {
    private final HashMap<Integer, Sportsmen> sportsmenHashMap = new HashMap<>();
    private int count;

    public void addToSportsmenHashMap(Sportsmen... sportsmen) {
        for (Sportsmen sportsman : sportsmen) {
            sportsmenHashMap.put(count, sportsman);
            count++;
        }
    }

    public boolean inMap(Integer number) {
        return sportsmenHashMap.containsKey(number);
    }

    public int getCountSameSportsmen(Sportsmen sportsmen) {
        int count = 0;
        for (Map.Entry<Integer, Sportsmen> pair : sportsmenHashMap.entrySet()) {
            if (pair.getValue().equals(sportsmen)) {
                count++;
            }
        }
        return count;
    }
}
