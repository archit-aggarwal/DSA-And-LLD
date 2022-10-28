class Parent {
    String parentData = "Parent";

    Parent() {
        System.out.println("Parent's Constructor");
        System.out.println(this.parentData);
    }

    public void parentFun() {
        System.out.println("This is Parent's Method");
    }
}

class Child extends Parent {
    String childData = "Child";

    Child() {
        super(); // parent's constructor

        System.out.println("Child's Constructor");
        System.out.println(this.childData);

        System.out.println(super.parentData); // Access Parent's Data Members

        super.parentFun(); // Access Parent's Method
    }
}

class Driver {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Child obj = new Child();
    }
}