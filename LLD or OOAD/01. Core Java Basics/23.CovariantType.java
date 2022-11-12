class Parent {
    public void fun() {
        System.out.println("This is parent's void fun");
    }

    public Parent getObject() {
        System.out.println("This is parent's GetObject");
        return new Parent();
    }
}

class Child extends Parent {
    // public int fun(){
    // System.out.println("This is parent's int fun");
    // }
    // Invalid: Child should have void returntype

    @Override
    public Child getObject() {
        System.out.println("This is child's GetObject");
        return new Child();
    }
    // Non-Primitive Covariant Type
}

class Driver {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Child obj2 = new Child();

        Parent obj3 = obj1.getObject();
        obj3.fun();
        // Parent Ref: Parent Object

        // Child obj4 = obj1.getObject(); // Not Valid

        Parent obj5 = obj2.getObject(); // Overriding
        obj5.fun();
        // Parent Ref: Child Object

        Child obj6 = obj2.getObject();
        obj6.fun();
        // Child Ref: Child Object
    }
}