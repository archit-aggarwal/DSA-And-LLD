class Outer {
    private String outerData = "Outer";

    public String getOuterData() {
        return outerData;
    }

    public static String outerStaticData = "OuterStatic";

    public static void outerFun() {
        System.out.println(Inner.innerStaticData);
        System.out.println(outerStaticData);
    }

    class Inner {
        String innerData = "Inner";

        public String getInnerData() {
            return innerData;
        }

        public static String innerStaticData = "InnerStatic";

        public static void innerFun() {
            System.out.println(innerStaticData);
            System.out.println(outerStaticData);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Outer outerobj = new Outer();
        System.out.println(outerobj.getOuterData());

        Outer.Inner innerobj = outerobj.new Inner();
        System.out.println(innerobj.innerData);

        Outer.outerFun();
        Outer.Inner.innerFun();
    }
}
