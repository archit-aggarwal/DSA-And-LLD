class Outer {
    String outerData = "outerData";
    static String outerStaticData = "outerStaticData";

    public void outerFun() {
        System.out.println(outerStaticData + " " + Inner.innerStaticData + " " + outerData);
        // System.out.println(innerData); Not Accessible: You need Inner Class Object
    }

    public static void outerStaticFun() {
        System.out.println(outerStaticData + " " + Inner.innerStaticData);
    }

    static class Inner {
        String innerData = "innerData";
        static String innerStaticData = "innerStaticData";

        public void innerFun() {
            System.out.print(outerStaticData + " " + innerStaticData + " ");
            System.out.println(innerData);
            // System.out.println(outerData);
            // Without Outer Class Object -> Inner Class Object can be made
            // Outer Class Non Static Variables will not be accessible
        }

        public static void innerStaticFun() {
            System.out.println(outerStaticData + " " + innerStaticData);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.innerFun();
        Outer.Inner.innerStaticFun();

        Outer outerObj = new Outer();
        outerObj.outerFun();
        Outer.outerStaticFun();

    }
}
