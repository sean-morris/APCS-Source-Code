import java.util.Random;

public class StPeters
{
    private Random r = new Random();
    private double entryFee;
    private int pot = 1;
   
    public StPeters(double fee){
        this.entryFee = fee;    
    }
    
    public void optimizeEntryFee(){
        //your code here -- after you write and test runGame() and flip()
    }
    
    public void tester(int howMany){
        int counter = 0;
        int countBreakEvenOrWin=0;
        while(counter < howMany)
        {
           pot = 1;
           if(runGame() >= this.entryFee)
                countBreakEvenOrWin++;
           counter++;
        }
        System.out.println("Entry Fee: " + this.entryFee + " : " + countBreakEvenOrWin + " broke even or won out of " + howMany + " tries. Chance of winning: " + countBreakEvenOrWin * 1.0 / howMany); 
    }
    
    //returns the amount of money you win in the game
    private int runGame(){
           //your code here
    }
    
    //code to return a 0 or 1 simulating a flip
    private int flip(){
        //your code here
    }    
}
