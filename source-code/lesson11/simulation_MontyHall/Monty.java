import java.util.*;

public class Monty {

   
    private Random randoms;
    private Contestant player;
   
    
    public Monty ( ) {
        Calendar c = Calendar.getInstance ( );
        randoms = new Random (c.getTimeInMillis ( ));
        player = new Contestant (randoms);
    }
    
    // Play the game, returning 1 if the contestant wins and 0 if not.
    public int playGame ( ) {
        int doorWithCar;
        int firstChoice, secondChoice;
        int goatDoor;
        
        doorWithCar = gameStart ( );
        firstChoice = playerGuess ( );
        goatDoor = tempt (doorWithCar, firstChoice);
        secondChoice = newGuess (goatDoor, firstChoice);
        return gameResult (doorWithCar, goatDoor, secondChoice);
    }
    
    // Set up the game, returning the position of the car (chosen randomly).
    private int gameStart ( ) {
        int doorWithCar = randoms.nextInt (3) + 1;
        return doorWithCar;
    }

    // Return the contestant's first guess.
    private int playerGuess ( ) {
        return player.guess1 ( );
    }
    
    // Tempt the contestant by revealing a door with a goat.  
    // Return the number of the newly opened door.
    private int tempt (int doorWithCar, int firstChoice) {
        int doorToOpen;
        doorToOpen = goatDoorToShow (doorWithCar, firstChoice);
        return doorToOpen;
    }

    // This is called by Monty after the contestant makes his/her first guess.
    // It returns the position of a door behind which is a goat.
    private int goatDoorToShow (int doorWithCar, int chosenDoor) {
        int doorToOpen;
        if (chosenDoor == doorWithCar) {
            // The contestant has chosen the door with the car.
            // Return the result of a random choice between the two goat doors.
            int r = randoms.nextInt (2);
            if (chosenDoor == 1) {
                doorToOpen = r+2;
            } else if (chosenDoor == 2) {
                doorToOpen = r*2+1;
            } else {
                doorToOpen = r+1;
            }
        } else {
            // The contestant has chosen a goat door.
            // Open the door that contains the other goat.
            doorToOpen = 6 - (chosenDoor+doorWithCar);
        }
        return doorToOpen;
    }
    
    // The contestant decides on a second guess, aided (?) by knowing that the given
    // door has a goat.  Return the updated guess.
    private int newGuess (int goatDoor, int firstChoice) {
        int guess;
        guess = player.guess2 (goatDoor);
        return guess;
    }
    
    // The contestant has made a final guess (the value in secondChoice).
    // Open the contestant's chosen door, along with the door hiding the car
    // if the contestant guessed incorrectly.
    // Then reveal the result.  Return 1 if win, 0 if loss.
    private int gameResult (int doorWithCar, int goatDoor, int secondChoice) {
        if (secondChoice == doorWithCar) {
            return 1;
        } else {
            return 0;
        }
    }
}
