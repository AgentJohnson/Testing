package main;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer,Long> map = new HashMap<>();

    public long fib(int n) {
        if(n <= 2) return 1;
        if(map.containsKey(n)) return (long)map.get(n);
        map.put(n,fib(n-1) + fib(n-2));
        return (long)map.get(n);
    }
}
