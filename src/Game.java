import java.util.ArrayList;
import java.util.Random;

public class Game  {                            // Game Class
    static ArrayList<String> winner = new ArrayList<>();    // stores all the histories in this attribute
    int computer;                                           // this variable stores the computers choice
    Menu menu;

    public ArrayList<String> getWinner() {
        return winner;
    } // this method gets the scores

    public void newMatch(){            // this method works all the match
        menu = new Menu();
        do {
            System.out.println("What do you want to choose?:\n---------------");// the Game menu.
            System.out.println("1. Sten");
            System.out.println("2. Sax");
            System.out.println("3. Påse");
            menu.playerChoice = menu.scanner.nextInt();             // here we call playerChoice and scanner from the Menu class.
            computer = (int) ((Math.random()*3) + 1);               // this will do the maths random between 1 and 3 for the computers choice

        switch (menu.playerChoice) {
                case 1:
                    if (computer == 1) {
                        System.out.println("Computer's choice is sten. So the game is drawn");
                        winner.add("Drawn");                        // we add the result to the arrayList
                    } else if (computer == 2) {
                        System.out.println("You winn, the computers choice was sax. ");
                        winner.add("Won");
                    } else {
                        System.out.println("you lose, the computers choice was påse");
                        winner.add("Lost");
                    }
                    break;

                case 2:
                    if(computer == 1){
                        System.out.println("you lose, computers choice was sten");
                        winner.add("Lost");
                    }else if(computer == 2){
                        System.out.println("the game is drawn, computers choice was sax");
                        winner.add("Drawn");
                    }else  {
                        System.out.println("you winn, computers choice was påse");
                        winner.add("Won");
                    }
                    break;

                case 3:
                    if(computer == 1){
                        System.out.println("you win, computers choice was sten");
                        winner.add("Won");
                    }else if(computer == 2){
                        System.out.println("You lose, computers choice was sax");
                        winner.add("Lost");
                    }else  {
                        System.out.println("the game is drawn, computers choice was påse");
                        winner.add("Drawn");
                    }
                    break;

                default:
                    System.out.println("You need to write 1-3");
                }
            } while (menu.playerChoice > 3);                   // do while loop goes once if the input is less than or equal to 3.
        menu.afterMatchMenu();                            // here going back to the after match menu in the menu class
    }

    public void history() {                   // this method prints out the history of the match.

        System.out.println("Showing history");

        if(getWinner().size() == 0){                    // this condition gives the message if the player tries to see the history before playing
            System.out.println("You have no history yet. You need to play first.");
        }

        int counter = 0;
        for (int i = 0; i < getWinner().size(); i++) {
            counter++;
            if(counter == 1) System.out.println(counter + "st match " + winner.get(i));
            if(counter == 2) System.out.println(counter + "nd match " + winner.get(i));
            if(counter == 3) System.out.println(counter + "rd match " + winner.get(i));
            if(counter > 3)  System.out.println(counter + "th match " + winner.get(i));
        }
    }

}