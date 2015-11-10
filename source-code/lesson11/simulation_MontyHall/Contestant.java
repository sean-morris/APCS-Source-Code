import java.util.*;

public class Contestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Controller control;
    private Random myRandoms;
    
    public Contestant (Controller c, Random randoms) {
        control = c;
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = //do this ...;
        control.picture (control.CONTESTANT_CHOICE, myInitialGuess, 0);
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor) {
        //do this ...;
    }
}
