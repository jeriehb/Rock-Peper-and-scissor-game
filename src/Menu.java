import java.util.Scanner;

public class Menu {                    // Menu Class
    Scanner scanner = new Scanner(System.in);  // attributes that we need them in this class, scanner to get input from the user, menuChoice
    int menuChoice;                            // used for input choice for menu, playerChoice input when a user plays the game. and open a new
    int playerChoice;                          // Game class here in order to use the methods here from the Game class
    Game game = new Game();


    public void mainMenu(){                                 // this method used to print the Main menus
        do {
            System.out.println("Main Menu: \n ---------");
            System.out.println("1. New Match");
            System.out.println("2. History");
            System.out.println("3. End Game");
            menuChoice = scanner.nextInt();

            switch (menuChoice){
                case 1:
                    game.newMatch();                   // when the user chooses new match this code takes to newMatch method in Game class
                    break;
                case 2:
                    game.history();                    // this line goes to history method in Game class
                    break;
                case 3:
                    System.out.println("The game has ended. Have a nice time"); // this will end the whole game
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have written invalid number write 1 - 3 "); // if user enters a wrong number which is not in the menu
                    break;                                                              // this will give a message to correct.
            }
        }while (menuChoice != 3);
    }

    public void afterMatchMenu(){                         // this method prints the menu after the match.
        do{
            System.out.println("Enter your choice");
            System.out.println("1. Menu");
            System.out.println("2. Play Again");
            System.out.println("3. To quit the game");
            playerChoice = scanner.nextInt();

            if(playerChoice == 1){              // takes you to the main menu
                mainMenu();
            }
            else if(playerChoice == 2){        // takes you to the match if you want to play again
                game.newMatch();
            }else if(playerChoice > 3){
                System.out.println("write whole number 1 - 3");
            }
            else if (playerChoice == 3){                            // this will close the whole game
                System.out.println("You have quited the game");
                System.exit(0);
                break;
            }
        }while (playerChoice > 3);
    }

    public static void main(String[] args) {               // main method of the whole program the computer begins from here, we have two classes
        Menu menu = new Menu();                            // in this program Menu and Game.
        Game game = new Game();

        menu.mainMenu();
        game.newMatch();
    }
}
