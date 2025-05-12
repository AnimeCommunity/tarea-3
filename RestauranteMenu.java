import java.util.ArrayList;

class Recipe {
    private String name;
    private double price;

    public Recipe(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - $" + String.format("%.2f", price);
    }
}

public class RestauranteMenu {
    public static void main(String[] args) {
        // paso 1
        ArrayList<Recipe> menu = new ArrayList<>();
        menu.add(new Recipe("Spaghetti bolgnese", 12.50));
        menu.add(new Recipe("Chicken", 13.00));
        menu.add(new Recipe("Beef burger", 10.00));
        menu.add(new Recipe("Caesar salad", 8.50));
        menu.add(new Recipe("Grilled salmon", 15.75));

        // paso 2
        menu.set(2, new Recipe("Vegan buddha bowl", 11.00));

        // paso 3
        System.out.println("Total: " + menu.size());

        // paso 4
        System.out.println("\n--- Menu ---");
        for (Recipe recipe : menu) {
            System.out.println(recipe);
        }
    }
}
