class Admin {
}

class User {
}

class RegUser {
}

class TheaterStore {
    public void editShow(Admin user) {
        System.out.println("Show Added/Modified in Database");
    }
}

class TheaterView {
    public void viewShow(User user) {
        System.out.println("View Show Listings");
    }
}

class TheaterBook {
    public void bookShow(RegUser user) {
        System.out.println("Select seats and proceed to payments");
    }
}

class App {
    public static void main(String[] args) {
        TheaterStore pvr1 = new TheaterStore();
        pvr1.editShow(new Admin());

        TheaterView pvr2 = new TheaterView();
        pvr2.viewShow(new User());

        TheaterBook pvr3 = new TheaterBook();
        pvr3.bookShow(new RegUser());
    }
}