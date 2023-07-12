package SchoolTutorial.week5;

import java.util.Scanner;

public class RecipeComponent {
    private double amount;
    private Ingredient ingredient;

    private String comment;


    public RecipeComponent(double amount, Ingredient ingredient,String comment) {
        this.amount = amount;
        this.ingredient =ingredient;
        this.comment = comment;
    }

    // adding new
    public static RecipeComponent createRecipeComponent() {
        Ingredient ingredient = Ingredient.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please drop comments about the ingredient: ");
        String comment = scanner.nextLine();
        return new RecipeComponent(amount, ingredient,comment);
    }


    public void displayRecipeComponent() {
        this.ingredient.displayIngredient();
        System.out.println("Amount: " + " " + this.getAmount());
        System.out.println("Comment: " + " " + this.getComment());
    };

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
