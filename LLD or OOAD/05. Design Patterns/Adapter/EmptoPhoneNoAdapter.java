package Adapter;

import java.util.*;

public class EmptoPhoneNoAdapter implements IPhoneList {
    List<String> employees;

    public EmptoPhoneNoAdapter(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getPhoneList() {
        List<String> phones = new ArrayList<>();

        for (String emp : employees) {
            String[] data = emp.split("-");
            phones.add(data[3]);
        }

        return phones;
    }
}
