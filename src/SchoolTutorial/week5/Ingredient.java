package SchoolTutorial.week5;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    private Ingredient(String name, String measurementUnit) {
        this.name = name;
        setMeasurementUnit(measurementUnit);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMeasurementUnit() {
        return measurementUnit;
    }
    public void setMeasurementUnit(String measurementUnit1) {
        String[] measurementUnitRequire = {"spoon", "teaspoon", "mg", "kg"};
        boolean choose = false;
        while (!choose) { // this choose is false
            for (String i : measurementUnitRequire) {
                if (measurementUnit1.equalsIgnoreCase(i)) {
                    choose = true;
                }
            }
            if (choose) { // choose is true
                this.measurementUnit = measurementUnit1;
            } else { // choose is false
                System.out.println("Error unit, please re-enter unit again");
                Scanner scanner = new Scanner(System.in);
                measurementUnit1 = scanner.nextLine();
            }
            }
        }
    /*
    call ingredient class need to return ingredient object
     */
    public static Ingredient createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("Please enter the measurement Unit: ");
        String measurementUnit = scanner.nextLine();
        return new Ingredient(ingredient,measurementUnit);
    }
    public void displayIngredient() {
//        return String.format("The ingredient is %s and the measurementUnit is %s", this.getName(),this.getMeasurementUnit());
        System.out.println("The ingredient is" + " " + this.getName() + " " + "and measurementUnit is" + " " + this.getMeasurementUnit());
    }
}
