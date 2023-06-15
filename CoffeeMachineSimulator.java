package CoffeeMachineSimulator;

import java.util.Scanner;

public class CoffeeMachineSimulator {
    private int water;
    private int milk;
    private int beans;
    private int money;
    private int espressoWater;
    private int espressoBeans;
    private int latteWater;
    private int latteMilk;
    private int latteBeans;
    private int cappuccinoWater;
    private int cappuccinoMilk;
    private int cappuccinoBeans;
    private int espressoPrice;
    private int lattePrice;
    private int cappuccinoPrice;
    private int espressoCount;
    private int latteCount;
    private int cappuccinoCount;
    private int totalEarnings;

    public CoffeeMachineSimulator() {
        water = 0;
        milk = 0;
        beans = 0;
        money = 0;
        espressoWater = 250;
        espressoBeans = 16;
        latteWater = 350;
        latteMilk = 75;
        latteBeans = 20;
        cappuccinoWater = 200;
        cappuccinoMilk = 100;
        cappuccinoBeans = 12;
        espressoPrice = 4;
        lattePrice = 7;
        cappuccinoPrice = 6;
        espressoCount = 0;
        latteCount = 0;
        cappuccinoCount = 0;
        totalEarnings = 0;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String command;
        do {
            System.out.println("Please select an action:");
            System.out.println("1. Buy Coffee");
            System.out.println("2. Fill Materials");
            System.out.println("3. Take Money");
            System.out.println("4. Show Ingredients and Money in Machine");
            System.out.println("5. Analytics");
            System.out.println("0. Exit");
            command = sc.nextLine();
            switch (command) {
                case "1":
                    buyCoffee(sc);
                    break;
                case "2":
                    fillIngredients(sc);
                    break;
                case "3":
                    takeMoney();
                    break;
                case "4":
                    showIngredients();
                    break;
                case "5":
                    showAnalytics();
                    break;
                case "0":
                    System.out.println("Exiting the simulator...");
                    break;
                default:
                    System.out.println("Invalid command! Please try again.");
            }
        } while (!command.equals("0"));
        sc.close();
    }

    private void buyCoffee(Scanner sc) {
        System.out.println("Please select a coffee type:");
        System.out.println("1. Espresso ($" + espressoPrice + ")");
        System.out.println("2. Latte ($" + lattePrice + ")");
        System.out.println("3. Cappuccino ($" + cappuccinoPrice + ")");
        System.out.println("0. Back");
        String coffeeType = sc.nextLine();
        switch (coffeeType) {
            case "1":
                makeCoffee("espresso");
                break;
            case "2":
                makeCoffee("latte");
                break;
            case "3":
                makeCoffee("cappuccino");
                break;
            case "0":
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid coffee type! Please try again.");
        }
    }

    private void makeCoffee(String coffeeType) {
        if (coffeeType.equals("espresso") && hasEnoughIngredients(espressoWater, 0, espressoBeans)) {
            System.out.println("Dispensing espresso. Enjoy!");
            water -= espressoWater;
            beans -= espressoBeans;
            money += espressoPrice;
            espressoCount++;
            totalEarnings += espressoPrice;
        } else if (coffeeType.equals("latte") && hasEnoughIngredients(latteWater, latteMilk, latteBeans)) {
            System.out.println("Dispensing latte. Enjoy!");
            water -= latteWater;
            milk -= latteMilk;
            beans -= latteBeans;
            money += lattePrice;
            latteCount++;
            totalEarnings += lattePrice;
        } else if (coffeeType.equals("cappuccino")
                && hasEnoughIngredients(cappuccinoWater, cappuccinoMilk, cappuccinoBeans)) {
            System.out.println("Dispensing cappuccino. Enjoy!");
            water -= cappuccinoWater;
            milk -= cappuccinoMilk;
            beans -= cappuccinoBeans;
            money += cappuccinoPrice;
            cappuccinoCount++;
            totalEarnings += cappuccinoPrice;
        } else {
            System.out.println("Insufficient ingredients to make " + coffeeType + "! Please refill.");
        }
    }

    private boolean hasEnoughIngredients(int requiredWater, int requiredMilk, int requiredBeans) {
        return water >= requiredWater && milk >= requiredMilk && beans >= requiredBeans;
    }

    private void fillIngredients(Scanner sc) {
        System.out.println("Enter the amount of water to add: ");
        int waterToAdd = sc.nextInt();
        System.out.println("Enter the amount of milk to add: ");
        int milkToAdd = sc.nextInt();
        System.out.println("Enter the amount of beans to add: ");
        int beansToAdd = sc.nextInt();
        water += waterToAdd;
        milk += milkToAdd;
        beans += beansToAdd;
    }

    private void takeMoney() {
        System.out.println("Money collected: Rs." + money);
        money = 0;
    }

    private void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " units");
        System.out.println("Money in Coffee Machine: Rs." + money);
    }

    private void showAnalytics() {
        System.out.println("Espresso sold: " + espressoCount);
        System.out.println("Latte sold: " + latteCount);
        System.out.println("Cappuccino sold: " + cappuccinoCount);
        System.out.println("Total earnings: $" + totalEarnings);
        System.out.println("Total ingredients consumed:");
        System.out.println("Water: "
                + (espressoCount * espressoWater + latteCount * latteWater + cappuccinoCount * cappuccinoWater)
                + " ml");
        System.out.println("Milk: " + (latteCount * latteMilk + cappuccinoCount * cappuccinoMilk) + " ml");
        System.out.println("Beans: "
                + (espressoCount * espressoBeans + latteCount * latteBeans + cappuccinoCount * cappuccinoBeans)
                + " units");
    }

    public static void main(String[] args) {
        CoffeeMachineSimulator simulator = new CoffeeMachineSimulator();
        simulator.run();
    }
}
