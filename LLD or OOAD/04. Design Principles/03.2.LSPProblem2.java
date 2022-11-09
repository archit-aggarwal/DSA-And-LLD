class Product {
    private double price, gstPercent;

    Product(double price, double gstPercent) {
        this.price = price;
        this.gstPercent = gstPercent;
    }

    public double getPriceWithTax() {
        return price + price * (gstPercent / 100.0);
    }

    public double getPriceWithoutTax() {
        return price;
    }

    public double getGstPercent() throws Exception {
        return gstPercent;
    }

    public void setGstPercent(double gstPercent) throws Exception {
        this.gstPercent = gstPercent;
    }
}

class Dairy extends Product {
    Dairy(double price) {
        super(price, 0.0);
    }

    @Override
    public double getGstPercent() throws Exception {
        throw new Exception("No GST on Dairy");
    }

    @Override
    public void setGstPercent(double gstPercent) throws Exception {
        throw new Exception("No GST on Dairy");
    }
}

class Driver {
    public static void helper(Product p) {
        try {
            System.out.println(p.getGstPercent());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(p.getPriceWithTax());
        System.out.println(p.getPriceWithoutTax());
    }

    public static void main(String[] args) {
        Product phone = new Product(20000.0, 18);
        helper(phone);

        Product milk = new Dairy(100.0);
        helper(milk);
    }
}