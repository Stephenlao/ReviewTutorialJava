package SchoolTutorial.week4;

import java.util.Scanner;

public class RecipeComponent {
    private double amount;
    private Ingredient ingredient;

    public RecipeComponent(double amount, Ingredient ingredient) {
        this.amount = amount;
        this.ingredient =ingredient;
    }
    public static RecipeComponent createRecipeComponent() {
        Ingredient ingredient = Ingredient.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount = scanner.nextDouble();
        return new RecipeComponent(amount, ingredient);
    }


    public void displayRecipeComponent() {
        this.ingredient.displayIngredient();
        System.out.println("Amount: " + " " + this.getAmount());
    };

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
