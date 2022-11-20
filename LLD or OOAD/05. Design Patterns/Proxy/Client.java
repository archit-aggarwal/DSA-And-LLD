package Proxy;

public class Client {
    public static void main(String[] args) {
        WorkInterface dao = new DatabaseWork();

        dao.insert(6, 2021);
        dao.insert(5, 2022);
        System.out.println(dao.read(2022));

        WorkInterface dao2 = new AuthProxy();
        ((AuthProxy) dao2).password = "1234";

        dao2.insert(6, 2021);
        dao2.insert(5, 2022);
        System.out.println(dao2.read(2022));

        WorkInterface dao3 = new CacheProxy();

        dao3.insert(6, 2022);
        System.out.println(dao3.read(2022));
        dao2.update(5, 2022);
        System.out.println(dao3.read(2022)); // inconsistency
    }
}
