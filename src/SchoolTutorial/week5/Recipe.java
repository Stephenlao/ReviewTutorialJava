package SchoolTutorial.week5;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> components;

    /*
    create static int count which means
    this variable is shared among all instances of
    class Recipe (variable belongs to the class)
     */
    private static int count;

    public Recipe(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponents() {
        System.out.println("Adding new component...");
        components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayComponent() {
        System.out.println(name + " " + "(recipe)");
        for(RecipeComponent i : components) {
            i.displayRecipeComponent();
            System.out.println("--------------");
            count++;
        }
    }

    public void countRecipe() {
        System.out.printf("Number of recipes: %d ", getCount());
    }

    public int getCount(){
        return count;
    }
}

