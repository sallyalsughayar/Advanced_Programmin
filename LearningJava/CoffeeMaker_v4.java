package LearningJava;

import java.util.Scanner;

public class CoffeeMaker_v4 {

    // Private & public are "Visibility modifiers"
    // instance varaibles (attributes)
    private int water;
    private int coffee;
    private int sugar;
    Scanner scanner = new Scanner(System.in);


    // methods, functions (actions)
    private void boil() {
        water -= .2;
        System.out.println("Boiling water..., remaining amount : " + water);
    }

    private void addCoffee() {
        coffee -= 50;
        System.out.println("Adding coffee..., remanining amount: " + coffee);
    }

    private void addSugar() {

        System.out.println("Adding sugar..., sugar amount " + sugar);
    }

    private void serve() {
        System.out.println("Serving coffeee...");
    }

    public void prepapreCoffee() {
        if (water > 1 && coffee > 100 && sugar > 1) {
            boil();
            addCoffee();
            addSugar();
            serve();
        } else {
            System.out.println("Error in ingrediants");
        }
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        if (water < 2) {
            System.out.println("Error, invalid amount");
        } else {
            this.water = water;
        }
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        System.out.println("enter the sugar amount");
        sugar=scanner.nextInt();
        this.sugar = sugar;
    }
}
