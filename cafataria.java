public class cafataria {

    int itemId;
    String itemName;
    double price;
    double finalPrice;

    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    void addFoodItem(int id, String name, double price) {
        this.itemId = id;
        this.itemName = name;
        this.price = price;
        totalFoodItems++;
    }

    void calculateFinalPrice() {
        finalPrice = price + (price * serviceCharge / 100);
    }

    void displayItemDetails() {
        calculateFinalPrice();

        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Original Price: " + price);
        System.out.println("Final Price: " + finalPrice);
        System.out.println();
    }

    static void changeServiceCharge(double newCharge) {
        serviceCharge = newCharge;
    }

    static void displayCafeteriaDetails() {
        System.out.println("Cafeteria Name: " + cafeteriaName);
        System.out.println("Service Charge: " + serviceCharge + "%");
        System.out.println("Total Food Items: " + totalFoodItems);
        System.out.println();
    }

    public static void main(String[] args) {

        cafataria item1 = new cafataria();
        cafataria item2 = new cafataria();
        cafataria item3 = new cafataria();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        cafataria.displayCafeteriaDetails();

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        cafataria.changeServiceCharge(15);

        System.out.println("After Updating Service Charge");

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}