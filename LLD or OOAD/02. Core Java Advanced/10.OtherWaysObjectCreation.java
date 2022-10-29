class Driver {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // Demo obj = new Demo();

        try {
            Driver obj = (Driver) Class.forName("Driver").newInstance();
            System.out.println(obj);

            Driver obj2 = Driver.class.newInstance();
            System.out.println(obj2);
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}
