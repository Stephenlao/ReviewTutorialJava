package week4;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> components;

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
        }
    }
}

