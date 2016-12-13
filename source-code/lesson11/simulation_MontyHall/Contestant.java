import java.util.*;

public class Contestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public Contestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = //do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor) {
        //do this ...;
    }
}
