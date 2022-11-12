class Parent {
    int parentData;

    public static void staticFun() {
        System.out.println("This is parent's static function");
    }

    public void privateFun() {
        System.out.println("This is parent's private function but it is public");
    }

    public void publicFun() {
        System.out.println("This is parents's fun with 0 parameter");
    }
}

class Child extends Parent {
    int childData;

    public static void staticFun() {
        System.out.println("This is child's static function");
    }

    // private void privateFun() {}
    // Parent Public -> Child Private

    public void publicFun(int data) {
        System.out.println("This is child's fun with 1 parameter");
    }
}

class Driver {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.staticFun();
        obj1.publicFun();
        // obj1.publicFun(10); // THis is not allowed

        Child obj2 = new Child();
        obj2.staticFun();

        obj2.publicFun();
        obj2.publicFun(10);
        // Overloading with functions in different classes

        Parent obj3 = new Child();
        obj3.staticFun(); // Parent's Fun
        obj3.publicFun(); // Parent's Fun

        // No Dynamic Method Dispatch: No overriding
    }
}