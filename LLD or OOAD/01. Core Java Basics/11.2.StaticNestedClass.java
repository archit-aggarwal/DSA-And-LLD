class Movie {
    // Non Static or Instance Variables (Outer Class)
    int duration;
    String name;
    double rating;

    // Static or Class Variable (Outer Class)
    static String language = "English";

    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public void outerNonStaticFun() {
        // Access Outer Non Static Members (Properties & Other Functions) : Allowed
        System.out.println(" Name : " + this.name + " Duration : "
                + this.duration + " Rating : " + this.rating);

        // Access Outer Static Member (Properties & Other Functions) : Allowed
        System.out.println("Language : " + Movie.language);

        // Access Static Inner Class Static Members : Allowed
        System.out.println(Theater.screenType);

        // Access Static Inner Class Non Static Members
        // Without Inner Class Object: Not Allowed
        // System.out.println(this.chain + " " + this.noOfSeats);

        // With Inner Class Object: Allowed
        Theater inner = new Theater("PVR", 100);
        System.out.println(inner.chain + " " + inner.noOfSeats);

        System.out.println("------------------------");
    }

    public static void outerStaticFun() {
        // Access Outer Non Static Members (Properties & Other Functions) : Not Allowed
        // System.out.println(" Name : " + this.name + " Duration : " + this.duration +
        // " Rating : " + this.rating);
        // outerNonStaticFun();

        // Access Outer Static Member (Properties & Other Functions) : Allowed
        System.out.println("Language : " + Movie.language);

        // Access Static Inner Class Static Members : Allowed
        System.out.println(Theater.screenType);

        // Access Static Inner Class Non Static Members
        // Without Inner Class Object: Not Allowed
        // System.out.println(this.chain + " " + this.noOfSeats);

        // With Inner Class Object: Allowed
        Theater inner = new Theater("PVR", 100);
        System.out.println(inner.chain + " " + inner.noOfSeats);

        System.out.println("------------------------");

    }

    public static class Theater {
        // Non Static or Instance Variables (Inner Class)
        String chain;
        int noOfSeats;

        // Static or Class Variable (Inner Class)
        static String screenType = "2D";

        public Theater(String chain, int noOfSeats) {
            this.chain = chain;
            this.noOfSeats = noOfSeats;
        }

        public void innerNonStaticFun() {
            // Access Outer Non Static Members : Not Allowed
            // System.out.println(" Name : " + this.name + " Duration : "
            // + this.duration + " Rating : " + this.rating);

            // Access Outer Static Member (Properties & Other Functions) : Allowed
            System.out.println("Language : " + Movie.language);

            // Access Static Inner Class Static Members : Allowed
            System.out.println(Theater.screenType);

            // Access Static Inner Class Non Static Members: Allowed
            System.out.println(this.chain + " " + this.noOfSeats);

            System.out.println("------------------------");
        }

        public static void innerStaticFun() {
            // Access Outer Non Static Members (Properties & Other Functions) : Not Allowed
            // System.out.println(" Name : " + this.name + " Duration : " + this.duration +
            // " Rating : " + this.rating);
            // outerNonStaticFun();

            // Access Outer Static Member (Properties & Other Functions) : Allowed
            System.out.println("Language : " + Movie.language);

            // Access Static Inner Class Static Members : Allowed
            System.out.println(Theater.screenType);

            // Access Static Inner Class Non Static Members
            // Without Inner Class Object: Not Allowed
            // System.out.println(this.chain + " " + this.noOfSeats);

            // With Inner Class Object: Allowed
            Theater inner = new Theater("PVR", 100);
            System.out.println(inner.chain + " " + inner.noOfSeats);

            System.out.println("------------------------");
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Movie.outerStaticFun();
        Movie.Theater.innerStaticFun();

        Movie outer = new Movie("Avengers", 180, 4.5);
        outer.outerNonStaticFun();

        Movie.Theater inner = new Movie.Theater("PVR", 100);
        inner.innerNonStaticFun();
    }
}