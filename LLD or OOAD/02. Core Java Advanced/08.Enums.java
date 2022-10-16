import java.util.*;

abstract class Genre {
    public static final String ACTION = "Action";
    public static final String ROMANCE = "Romance";
    public static final String COMEDY = "Comedy";

    // There can be Empty or Parameterized Constructors
    // Public -> No Need of Getters
    // Final -> No Need of Setters
}

class ScreenType {
    public static final ScreenType TWOD = new ScreenType(250);
    public static final ScreenType THREED = new ScreenType(300);
    public static final ScreenType IMAX3D = new ScreenType(400);
    public static final ScreenType FOURDX = new ScreenType(600);

    int price;

    public ScreenType() {
        System.out.println("Constructor Called");
        price = 100;
    }

    public ScreenType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

enum ScreenTypeEnum {
    TWOD(250), THREED(300), IMAX3D(400), FOURDX(600);

    int price;

    ScreenTypeEnum() {
        System.out.println("Enum Constructor Called");
        price = 100;
    }

    ScreenTypeEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Solution {
    public static void oldFashioned() {
        Movie obj = new Movie();

        switch (obj.genre) {
            case Genre.ACTION: {
                System.out.println("Nerds will watch this movie");
                break;
            }
            case Genre.ROMANCE: {
                System.out.println("Couples will watch this movie");
                break;
            }
            case Genre.COMEDY: {
                System.out.println("Family will watch it together");
                break;
            }
            default: {
                System.out.println("No Such Genre Exists");
            }
        }
    }

    public static void main(String[] args) {
        ScreenType obj = ScreenType.THREED;
        System.out.println(obj);

        ScreenTypeEnum obj2 = ScreenTypeEnum.TWOD;

        System.out.println(obj.price);
        System.out.println(obj2.price);
        System.out.println(obj2.getPrice());

        System.out.println(ScreenTypeEnum.TWOD.ordinal());
        System.out.println(ScreenTypeEnum.THREED.ordinal());
        System.out.println(ScreenTypeEnum.IMAX3D.ordinal());
        System.out.println(ScreenTypeEnum.FOURDX.ordinal());

        System.out.println(ScreenTypeEnum.TWOD.name());
        System.out.println(ScreenTypeEnum.THREED.name());
        System.out.println(ScreenTypeEnum.IMAX3D.name());
        System.out.println(ScreenTypeEnum.FOURDX.name());

        // Looping on Constants of a enum
        for (ScreenTypeEnum c : ScreenTypeEnum.values()) {
            System.out.print(c.price + " ");
        }
    }
}