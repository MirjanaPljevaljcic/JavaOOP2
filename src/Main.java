public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("Apple", "iPhone 11", "123-456-7890", 65);

        myPhone.makeCall("602-858-4578");

        myPhone.installApp("Instagram");

        myPhone.displayInfo();
    }

}
