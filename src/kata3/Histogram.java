package kata3;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Histogram<T> implements Histogram_<T>{
    
    public final Map<T, Integer> map;

    public Histogram() {
        this.map =  new HashMap<T, Integer>();
    }

    @Override
    public Integer get(T key) {
        return map.get(key);
    }

    @Override
    public Set<T> keySet() {
        return map.keySet();
    }

    @Override
    public void increment(T key) {
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}
