package main;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {
    Map<String,Integer> map = new HashMap<>();

    public int uniquePaths(int m, int n) {
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        String key = m + "," + n;
        if(map.containsKey(key)) return (Integer)map.get(key);

        map.put(key,uniquePaths(m,n-1) + uniquePaths(m-1,n));
        return (Integer)map.get(key);
    }
}
