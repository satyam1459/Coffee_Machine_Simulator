

<h1 align="center"> 
Coffee Machine Simulator ☕</h1>

This is a Java console application that simulates a coffee machine. The program allows you to manage the coffee machine by performing various actions such as buying coffee, filling ingredients, taking money, and viewing the status and analytics of the machine.

---
## Prerequisites
![Java](https://img.shields.io/badge/Java-Java%20OOPs-Green?labelColor=yellow&style=flat)

## Features

The Coffee Machine Simulator provides the following features:

- **Buy**: Allows the user to purchase different types of coffee (Espresso, Latte, Cappuccino) with their respective prices. Coffee will be dispensed only if there are enough ingredients in the machine.

- **Espresso**: price - $4/cup, water needed – 250 ml/cup, milk needed – 0 ml/cup, beans needed - 16/cup

- **Latte**: price - $7/cup, water needed – 350 ml/cup, milk needed – 75 ml/cup, beans needed - 20/cup

- **Cappuccino**: price - $6/cup, water needed – 200 ml/cup milk needed – 100 ml/cup beans needed - 12/cup. 

- **Fill**: Enables the user to add more ingredients (water, milk, beans) to the coffee machine.
- **Take**: Allows the maintainer to collect the money accumulated in the money box.
- **Show**: Displays the current status of the coffee machine, including the amount of water, milk, beans, and money available.
- **Analytics**: Shows the count of each type of coffee sold, the total earnings, and the total amount of ingredients consumed.

## Getting Started

To run the Coffee Machine Simulator, follow these steps:

1. Ensure you have Java installed on your system.
2. Download the source code files or clone the repository.
3. Compile the Java source files using the following command:

```
javac CoffeeMachineSimulator.java
```

4. Run the application with the following command:

```
java CoffeeMachineSimulator
```

5. Follow the on-screen instructions to interact with the Coffee Machine Simulator.

## Usage

Once the application is running, you will be presented with a menu of actions to choose from. Enter the corresponding number for the action you want to perform:

1. **Buy**: Select the type of coffee you wish to buy.
2. **Fill**: Add more ingredients to the coffee machine.
3. **Take**: Collect the money from the money box.
4. **Show**: View the current status of the coffee machine.
5. **Analytics**: Display the sales statistics and ingredient consumption.
0. **Exit**: Quit the simulator.

Follow the prompts and enter the required information as requested by each action.

## OOPS Concepts Used

In the Coffee Machine Simulator code provided, several Object-Oriented Programming (OOP) concepts have been utilized. Here are the OOP concepts used in the implementation:

1. Classes and Objects:
   - The `CoffeeMachine` class represents the coffee machine and encapsulates its state and behavior.
   - The `Main` class contains the main method and serves as the entry point of the program.

2. Encapsulation:
   - The `CoffeeMachine` class encapsulates the internal state of the coffee machine, such as the amounts of water, milk, coffee beans, and money.

3. Abstraction:
   - The `CoffeeMachine` class provides an abstraction of a coffee machine by exposing methods to interact with its functionality, such as buying coffee, filling ingredients, taking money, and showing information.

4. Method Overloading:
   - The `buy` method in the `CoffeeMachine` class is overloaded to handle different types of coffee based on the input.

5. Data Hiding:
   - The instance variables in the `CoffeeMachine` class are private, preventing direct access from outside the class. Access to these variables is controlled through public methods, such as getters and setters.

6. Modularity:
   - The code is divided into separate classes (`CoffeeMachine` and `Main`) to separate concerns and promote modularity.

7. Single Responsibility Principle:
   - Each class has a single responsibility. The `CoffeeMachine` class is responsible for managing the coffee machine's state and behavior, while the `Main` class is responsible for handling user input and controlling the simulation.

These are the main OOP concepts used in the provided Coffee Machine Simulator code.

## Buying Coffee
<img width="493" alt="image1" src="https://github.com/satyam1459/Coffee_Machine_Simulator/assets/114183531/5fdd81c9-fb58-4beb-90a7-fa0039e1ca6a">

## Adding ingredients
<img width="347" alt="adding_ingredients" src="https://github.com/satyam1459/Coffee_Machine_Simulator/assets/114183531/d6c5b003-5d8c-47c9-b177-49e89f1e50cb">

## Buying Coffee and Seeing Remaining Ingredients and Money Collected So far
<img width="482" alt="BuyCoffee_and_showing_ingedients_and_monye" src="https://github.com/satyam1459/Coffee_Machine_Simulator/assets/114183531/cdd09aa5-e3df-4daf-af37-8b5c71d3fc32">

## See analytics and Collect Money from Machine
<img width="312" alt="show_analytics_collect_money" src="https://github.com/satyam1459/Coffee_Machine_Simulator/assets/114183531/9fdcbf03-0ff6-4af8-96ca-58639d03bdfd">





## Contributing

Contributions to the Coffee Machine Simulator project are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.

## License

This project is generated by @Satyam Jaiswal

## Acknowledgements

The Coffee Machine Simulator was developed as an example implementation based on OOPs concepts.

## Disclaimer

This Coffee Machine Simulator is a simplified program for educational purposes and does not represent a real coffee machine or its functionalities.
