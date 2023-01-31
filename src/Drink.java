import java.util.Scanner;

public class Drink {
    Scanner scanner = new Scanner(System.in);
    public static int priceOfCoffee = 35;
    public static int priceOfTea = 20;
    public static int priceOfLemonade = 35;
    public static int priceOfMojito = 35;
    public static int priceOfCocaCola = 30;
    public static int priceOfWater = 10;
    static int price;
    int totalCost;

    public void Menu() {
        System.out.println("Menu: ");
        DrinksMachine coffee = DrinksMachine.valueOf("coffee");
        System.out.println(coffee.getValue() + " " + coffee.getName() + " " + Drink.priceOfCoffee);
        DrinksMachine tea = DrinksMachine.valueOf("tea");
        System.out.println(tea.getValue() + " " + tea.getName() + " " + Drink.priceOfTea);
        DrinksMachine lemonade = DrinksMachine.valueOf("lemonade");
        System.out.println(lemonade.getValue() + " " + lemonade.getName() + " " + Drink.priceOfLemonade);
        DrinksMachine mojito = DrinksMachine.valueOf("mojito");
        System.out.println(mojito.getValue() + " " + mojito.getName() + " " + Drink.priceOfMojito);
        DrinksMachine water = DrinksMachine.valueOf("water");
        System.out.println(water.getValue() + " " + water.getName() + " " + Drink.priceOfWater);
        DrinksMachine coca_cola = DrinksMachine.valueOf("coca_cola");
        System.out.println(coca_cola.getValue() + " " + coca_cola.getName() + " " + Drink.priceOfCocaCola);
    }

    public void order() {
        System.out.println("Please, type a number of drink");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {

                case 1:
                    System.out.println("You have selected coffee");
                    price = Drink.priceOfCoffee;
                    break;
                case 2:
                    System.out.println("You have selected tea");
                    price = Drink.priceOfTea;
                    break;
                case 3:
                    System.out.println("You have selected lemonade");
                    price = Drink.priceOfLemonade;
                    break;
                case 4:
                    System.out.println("You have selected mojito");
                    price = Drink.priceOfMojito;
                    break;
                case 5:
                    System.out.println("You have selected water");
                    price = Drink.priceOfWater;
                    break;
                case 6:
                    System.out.println("You have selected coca_cola");
                    price = Drink.priceOfCocaCola;
                    break;
                default:
                    System.out.println("You select nothing. Have a nice day!");
                    break;
            }
            System.out.println("If you want one more drink, type number. If that's all type -no");
            scanner.nextLine();
            String moreDrinks = scanner.nextLine();
            if (moreDrinks.equals("1,2,3,4,5,6,7")) {
                order();
            } else if (moreDrinks.equals("no")){
                bill();
                break;
            }
        }
    }

    public void bill() {
        System.out.println("Thank you");
        System.out.println("You should pay: " + price);

    }


        }




