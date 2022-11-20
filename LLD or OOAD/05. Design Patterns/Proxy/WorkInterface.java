package Proxy;

public interface WorkInterface {
    public int read(int key);

    public void insert(int val, int key);

    public void update(int val, int key);

    public void remove(int key);
}
