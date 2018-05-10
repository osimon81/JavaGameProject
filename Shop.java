import java.util.Scanner;
/**
 * Write a description of class Shop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shop
{
    private int credits;
    /**
     * Constructor for objects of class Shop
     */
    public Shop(int CREDITS)
    {
        credits = CREDITS;
        enterShop(credits);
    }

    /**
     * 
     */
    public int enterShop(int credits)
    {
        int CREDITS = credits;
        Scanner scan = new Scanner(System.in);
        Items items = new Items();
        System.out.println();
        System.out.println("Welcome to the shop. You have " + credits + " credits to spend.");
        System.out.println();
        System.out.println("Enter 'items' to view the list and prices of items.");
        System.out.println("Enter 'commands' to view the list of commands.");
        System.out.println("Enter 'buy' along with the name of the item to purchase it.");
        System.out.println("Enter 'credits' to view your balance.");
        System.out.println("Enter 'exit' to exit the shop.");
        System.out.println();

        CREDITS = standby(CREDITS);
        

        return CREDITS;
    }

    private int standby(int cash){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print(">> ");
        String response = scan.nextLine();
        if (response.equals("items")) {
            System.out.println("Minor Healing Kit; +30 Health; 15 credits");
            System.out.println("Major Healing Kit; +60 Health; 25 credits");
            System.out.println("Wooden Shield; 25% Block-Chance; 20 credits");
            System.out.println("Iron Shield; 50% Block-Chance; 25 credits");
            System.out.println("Copper Sword; +20 Damage; 16 credits");
            System.out.println("Steel Sword; +40 Damage; 28 credits");
            standby(cash);
        }
        else if (response.equals("commands")) {
            System.out.println("Enter 'items' to view the list and prices of items.");
            System.out.println("Enter 'commands' to view the list of commands.");
            System.out.println("Enter 'buy' along with the name of the item to purchase it.");
            System.out.println("Enter 'credits' to view your balance.");
            System.out.println("Enter 'exit' to exit the shop.");
            standby(cash);
        }
        else if (response.equals("buy")) {
            System.out.println("Buy what?");
            standby(cash);
        }
        else if (response.substring(0,3).equals("buy")) {
            if ((response.substring(4).equals("Minor Healing Kit") || (response.substring(4).equals("minor healing kit")) && (cash - 15 >= 0))) {
                System.out.println("You bought the Minor Healing Kit!");
                cash = cash - 15;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Minor Healing Kit") || (response.substring(4).equals("minor healing kit")) && (cash - 15 < 0))) {
                System.out.println("You do not have enough credits to purchase the Minor Healing Kit. You have " + cash + " credits to spend.");
            }
            else if ((response.substring(4).equals("Major Healing Kit") || (response.substring(4).equals("major healing kit")) && (cash - 25 > 0))) {
                System.out.println("You bought the Major Healing Kit!");
                cash = cash - 25;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Major Healing Kit") || (response.substring(4).equals("major healing kit")) && (cash - 25 < 0))) {
                System.out.println("You do not have enough credits to purchase the Major Healing Kit. You have " + cash + " credits left to spend.");
                
            }
            else if ((response.substring(4).equals("Wooden Shield") || (response.substring(4).equals("wooden shield")) && (cash - 20 >= 0))) {
                System.out.println("You bought the Wooden Shield!");
                cash = cash - 20;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Wooden Shield") || (response.substring(4).equals("wooden shield")) && (cash - 20 < 0))) {
                System.out.println("You do not have enough credits to purchase the Wooden Shield. You have " + cash + " credits left to spend.");
            }
            else if ((response.substring(4).equals("Iron Shield") || (response.substring(4).equals("iron shield")) && (cash - 25 >= 0))) {
                System.out.println("You bought the Iron Shield!");
                cash = cash - 25;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Iron Shield") || (response.substring(4).equals("iron shield")) && (cash - 25 < 0))) {
                System.out.println("You do not have enough credits to purchase the Iron Shield. You have " + cash + " credits left to spend.");
            }
            else if ((response.substring(4).equals("Copper Sword") || (response.substring(4).equals("copper sword")) && (cash - 16 >= 0))) {
                System.out.println("You bought the Copper Sword!");
                cash = cash - 16;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Copper Sword") || (response.substring(4).equals("copper sword")) && (cash - 16 < 0))) {
                System.out.println("You do not have enough credits to purchase the Copper Sword. You have " + cash + " credits left to spend.");
            }
            else if ((response.substring(4).equals("Steel Sword") || (response.substring(4).equals("steel sword")) && (cash - 28 >= 0))) {
                System.out.println("You bought the Steel Sword!");
                cash = cash - 28;
                System.out.println("Credits: " + cash);
                standby(cash);
            }
            else if ((response.substring(4).equals("Steel Sword") || (response.substring(4).equals("steel sword")) && (cash - 28 < 0))) {
                System.out.println("You do not have enough credits to purchase the Steel Sword. You have " + cash + " credits left to spend.");
            }
            else {
                standby(cash);
            }
        }
        else if (response.equals("credits")) {
            System.out.println("You have " + cash + " credits to spend.");
            System.out.println();
            standby(cash);
        }
        else if (response.equals("exit")) {
            return cash;
        }
        else {
                System.out.println("You have entered an invalid command. Type 'commands' to see the list of commands.");
                standby(cash);
        }
        return cash;
    }
}