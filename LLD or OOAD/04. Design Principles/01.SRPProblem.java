class Admin {
}

class User {
}

class RegUser {
}

class Theater {
    public void editShow(Admin user) {
        System.out.println("Show Added/Modified in Database");
    }

    public void viewShow(User user) {
        System.out.println("View Show Listings");
    }

    public void bookShow(RegUser user) {
        System.out.println("Select seats and proceed to payments");
    }
}

class App {
    public static void main(String[] args) {
        Theater pvr = new Theater();

        pvr.editShow(new Admin());
        pvr.viewShow(new User());
        pvr.bookShow(new RegUser());
    }
}