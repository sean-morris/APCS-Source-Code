import java.util.Random;

public class DiceRollGenerator {

    private int die1;
    private int die2;
    private Random randGen;
    
    public DiceRollGenerator ( ) {
        randGen = new Random ( );
    }
    
    public void roll ( ) {
        die1 = 1 + randGen.nextInt (6);
        die2 = 1 + randGen.nextInt (6);
    }
    
    public int total ( ) {
        return die1 + die2;
    }
    
    public void runTest6In4Rolls(int howMany)
    {
        int count = 0,counter = 0;
        while(counter < howMany){
            if(takeATurnASixInFourRolls())
                count++;
            counter++;
        }
        System.out.println(count + " one 6 in 4 rolls tried " + howMany + " times : " + count * 1.0 / howMany);
    }
    

    private boolean takeATurnASixInFourRolls(){
        int counter = 0;
        while(counter < 4)
        {
                this.roll();
                if(die1 == 6)
                    return true;
                counter++;    
        }
        return false;
    }
    
    
    public void runTest12In24Rolls(int howMany)
    {
          //your code here    
    }
    
    
    private boolean takeATurnA12In24Rolls(){
    	 //your code here
    

    }
}