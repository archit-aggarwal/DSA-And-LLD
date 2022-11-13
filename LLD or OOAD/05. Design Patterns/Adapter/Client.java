package Adapter;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        EmployeeDetails producer = new EmployeeDetails();
        List<String> employees = producer.GetEmployees();

        EmptoPhoneNoAdapter adapter = new EmptoPhoneNoAdapter(employees);

        Intranet consumer = new Intranet(adapter);
        consumer.printPhoneNumbers();
    }
}
