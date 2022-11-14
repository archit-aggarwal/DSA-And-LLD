interface MyInterface {
    // Default Method: Object's Method
    default void defaultFun() {
        System.out.println("Default fun: have a body");
        privateFun();
    }

    // private method: Within Interface
    private void privateFun() {
        System.out.println("Private fun: have a body");
    }

    // Interface's Method
    public static void staticFun() {
        System.out.println("Static fun: have a body");
    }
}

class MyClass implements MyInterface {
}

class Driver {
    public static void main(String[] args) {
        MyInterface.staticFun();

        MyClass obj = new MyClass();
        obj.defaultFun();
    }
}

