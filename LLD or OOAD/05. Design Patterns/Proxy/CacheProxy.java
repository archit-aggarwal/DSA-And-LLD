package Proxy;

import java.util.*;

public class CacheProxy implements WorkInterface {
    HashMap<Integer, Integer> cache = new HashMap<>();
    // key: request, value: response
    WorkInterface nextWork = new DatabaseWork();

    @Override
    public void insert(int val, int key) {
        nextWork.insert(val, key);
    }

    @Override
    public int read(int key) {
        if (cache.containsKey(key) == true) {
            return cache.get(key);
        }

        return nextWork.read(key);
    }

    @Override
    public void remove(int key) {
        nextWork.remove(key);
    }

    @Override
    public void update(int val, int key) {
        nextWork.update(val, key);
    }
}
