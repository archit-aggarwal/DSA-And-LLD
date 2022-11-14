interface ITheater {
    String industry = "Bollywood";
    // public, static, final

    // 100% abstraction

    void viewShow(); // public, abstract

    String bookShow();
}

class Theater implements ITheater {
    String name;

    public void viewShow() {
        System.out.println("Only View Access");
    }

    public String bookShow() {
        System.out.println("Book Access");
        return "ticket";
    }
}

class BookMyShow {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Theater pvr = new Theater();
        pvr.name = "PVR Cinemas";

        pvr.viewShow();

        System.out.println(ITheater.industry);
        System.out.println(Theater.industry);

        Theater cinepolis = new Theater();
        cinepolis.name = "Cinepolis Experience";

        cinepolis.bookShow();

        System.out.println(pvr.industry);
        System.out.println(cinepolis.industry);

    }
}