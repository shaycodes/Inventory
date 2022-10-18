import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> cars = new HashMap<>();
        cars.put("accord", "Honda");
        cars.put("camry", "Corolla");
        cars.put("charger", "Dodge");
        cars.put("maxima", "Nissan");

        String model = "";
        while(! model.equals("quit")){
            System.out.println("What kind of car are you looking for?");
            System.out.println("Type quit to exit.");
            model = input.nextLine().toLowerCase();
            if (cars.containsKey(model)) {
                System.out.printf("Oh, you're looking for a %s? \n", model);
                System.out.printf("Our %s collection is right over here.\n\n",cars.get(model));
            } else {
                if (! model.equals("quit")) {
                    System.out.println("Sorry, that vehicle is out of stock.\n");
                }
            }
        }
    }
}