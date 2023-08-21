public class MobilePhone {
    private String brand;
    private String model;
    private String phoneNumber;
    private int storageCapacity;

    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void makeCall(String number) {
        System.out.println("We are calling " + number + " from our " + brand + " " + model + " phone!!");
    }

    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on our " + brand + " " + model + " phone!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }

}
