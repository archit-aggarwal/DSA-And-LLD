class Parent {
    public void fun1() {

    }

    protected void fun2() {

    }

    void fun3() {

    }

    @SuppressWarnings("all")
    private void fun4() {
    }
}

class Child extends Parent {
    @Override
    public void fun1() {

    }

    @Override
    protected void fun2() {

    }
    // public void fun2(){}

    @Override
    void fun3() {

    }
    // protected void fun3(){}
    // public void fun4(){}
}