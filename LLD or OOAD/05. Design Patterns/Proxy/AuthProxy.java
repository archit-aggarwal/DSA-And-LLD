package Proxy;

public class AuthProxy implements WorkInterface {
    String password;
    WorkInterface realWork = new DatabaseWork();

    @Override
    public void insert(int val, int key) {
        if (password.equals("1234")) {
            realWork.insert(val, key);
        }
    }

    @Override
    public int read(int key) {
        if (password.equals("1234")) {
            return realWork.read(key);
        }
        return -1;
    }

    @Override
    public void remove(int key) {
        if (password.equals("1234")) {
            realWork.remove(key);
        }
    }

    @Override
    public void update(int val, int key) {
        if (password.equals("1234")) {
            realWork.update(val, key);
        }
    }

}
