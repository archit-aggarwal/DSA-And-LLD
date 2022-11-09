class ProductWithoutGst {
    protected double price;

    ProductWithoutGst(double price) {
        this.price = price;
    }

    public double getPriceWithoutTax() {
        return price;
    }
}

class Product extends ProductWithoutGst {
    protected double gstPercent;

    Product(double price, double gstPercent) {
        super(price);
        this.gstPercent = gstPercent;
    }

    public double getPriceWithTax() {
        return price + price * (gstPercent / 100.0);
    }

    public double getGstPercent() {
        return gstPercent;
    }

    public void setGstPercent(double gstPercent) {
        this.gstPercent = gstPercent;
    }
}

class Dairy extends ProductWithoutGst {
    Dairy(double price) {
        super(price);
    }
}

class Driver {
    public static void helper(ProductWithoutGst p) {
        if (p instanceof Product) {
            System.out.println(((Product) p).getGstPercent());
            System.out.println(((Product) p).getPriceWithTax());
        } else {
            System.out.println(p.getPriceWithoutTax());
        }
    }

    public static void main(String[] args) {
        ProductWithoutGst phone = new Product(20000.0, 18);
        helper(phone);

        ProductWithoutGst milk = new Dairy(100.0);
        helper(milk);
    }
}
