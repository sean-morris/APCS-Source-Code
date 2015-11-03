import java.util.Random;

public class StPeters
{
    private Random r = new Random();
    private double entryFee;
    private int pot = 1;
    
    public StPeters(double entryFee)
    {
        this.entryFee = entryFee;
    }

    public void tester(int howMany){
        int counter = 0;
        int countBreakEvenOrWin=0;
        while(counter < howMany)
        {
           //your code here
        }
        System.out.println(countBreakEvenOrWin + " broke even or won out of " + howMany + " tries. Chance of winning: " + countBreakEvenOrWin * 1.0 / howMany); 
    }
    
    private boolean runGame(){
           //your code here
    }
    
    //code to return a 0 or 1 simulating a flip
    private int flip(){
        //your code here
    }    
}
