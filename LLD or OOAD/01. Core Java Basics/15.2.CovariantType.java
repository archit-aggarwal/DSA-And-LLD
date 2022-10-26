class Parent {
    public Parent getInstance() {
        System.out.println("Parent's Get Instance Called");
        return this;
    }
}

class Child extends Parent {
    public Child getInstance() {
        System.out.println("Child's Get Instance Called");
        return this;
    }
}

class Solution {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = obj1.getInstance();
        System.out.println(obj1 == obj2);

        Child obj3 = new Child();
        Child obj4 = obj3.getInstance();
        System.out.println(obj3 == obj4);

        Parent obj5 = new Child();
        Parent obj6 = obj5.getInstance();
        System.out.println(obj5 == obj6);

        Child obj7 = (Child) obj5.getInstance();
        System.out.println(obj5 == obj7);
    }
}