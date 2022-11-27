package FactoryMethod.Solution;

public abstract class Vehicle {
    private String company;
    private int numberPlate;
    private String driverName;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void showVehicle() {
        System.out.println("Company : " + company);
        System.out.println("NumberPlate : " + numberPlate);
        System.out.println("DriverName : " + driverName);

    }
}
