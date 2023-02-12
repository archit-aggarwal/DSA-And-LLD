import java.util.*;
import models.*;
import services.*;

public class App {
    @SuppressWarnings("")
    public static void main(String[] args) {
        UserService users = new UserService();
        users.addUser(new User("u1", "Sita", "Sita@gmail.com", "9996567890"));
        users.addUser(new User("u2", "Shyam", "Shyam@gmail.com", "9876543210"));
        users.addUser(new User("u3", "Ram", "Ram@gmail.com", "7856839572"));
        users.addUser(new User("u4", "Balram", "Balram@gmail.com", "8811223344"));

        Scanner scn = new Scanner(System.in);

        try {
            while (true) {
                String input = scn.nextLine();
                String[] params = input.split(" ");
                int parser = 0;
                String query = params[parser++];

                switch (query) {
                    case "SHOW": {
                        ShowBalanceService balanceService = new ShowBalanceService();
                        if (params.length == 1) {
                            balanceService.showAllBalances();
                        } else {
                            balanceService.showBalance(params[parser++]);
                        }
                        break;
                    }

                    case "EXPENSE": {
                        String creditorID = params[parser++];
                        double totalAmount = Double.parseDouble(params[parser++]);
                        int debtorCount = Integer.parseInt(params[parser++]);
                        ExpenseService controller = new ExpenseService(creditorID, totalAmount, debtorCount);

                        for (int count = 0; count < debtorCount; count++) {
                            String debtorID = params[parser++];
                            controller.addSplit(debtorID);
                        }

                        ExpenseType type = ExpenseType.valueOf(params[parser++]);
                        controller.setType(type);

                        for (int count = 0; count < debtorCount; count++) {
                            double split = (type == ExpenseType.EQUAL)
                                    ? debtorCount
                                    : Double.parseDouble(params[parser++]);

                            controller.setAmount(count, split);
                        }

                        controller.addExpense();
                        break;
                    }
                    default: {
                        System.out.println("Quitting the Application");
                        return;
                    }
                }
            }
        } finally {
            scn.close();
        }
    }
}