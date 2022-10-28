class Outer {
    private String outerData = "Outer";

    Outer() {
        System.out.println(this.outerData);
    }

    public String getOuterData() {
        return outerData;
    }

    public static String outerStaticData = "OuterStatic";

    public static void outerFun() {
        System.out.println(Inner.innerStaticData);
        System.out.println(outerStaticData);
    }

    public void outerFun2() {
        System.out.println(Inner.innerStaticData);
        System.out.println(outerStaticData);
        System.out.println(outerData);

        Inner obj = new Inner();
        System.out.println(obj.innerData);
    }

    class Inner {
        String innerData = "Inner";

        Inner() {
            System.out.println(this.innerData);
        }

        public String getInnerData() {
            return innerData;
        }

        public static String innerStaticData = "InnerStatic";

        public static void innerFun() {
            System.out.println(innerStaticData);
            System.out.println(outerStaticData);
        }

        public void innerFun2() {
            System.out.println(innerStaticData);
            System.out.println(outerStaticData);
            System.out.println(innerData);
            System.out.println(outerData); 
            // Non Static Inner Class -> Outer Class Object Needed
            // Outer Non Static Variables are Accessible
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

        outerobj.outerFun2();
        innerobj.innerFun2();
    }
}
