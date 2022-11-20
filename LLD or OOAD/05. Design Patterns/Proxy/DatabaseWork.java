package Proxy;

import java.util.*;

public class DatabaseWork implements WorkInterface {
    HashMap<Integer, Integer> hm = new HashMap<>();

    @Override
    public void insert(int val, int key) {
        hm.put(key, val);
    }

    @Override
    public int read(int key) {
        if (hm.containsKey(key) == false) {
            System.out.println("Data Not Existing");
            return -1;
        }
        return hm.get(key);
    }

    @Override
    public void remove(int key) {
        if (hm.containsKey(key) == false) {
            System.out.println("Data Not Existing");
        }
        hm.remove(key);
    }

    @Override
    public void update(int val, int key) {
        if (hm.containsKey(key) == false) {
            System.out.println("Data Not Existing");
        }
        hm.put(key, val);
    }
}
