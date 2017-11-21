import java.util.Random;

public class DieRollGenerator {

    private int myRoll;
    private Random randGen;
    
    public DieRollGenerator ( ) {
        randGen = new Random ( );
    }
    public int forbiddenRoll(int forbidden){
	//your code here.    
    }

    public int nextRoll( ) {
      return randGen.nextInt(6) +1;
    }
    
   public void tester (int howMany) {
	  int k;
	  k = 0;
	  int f = (int)(Math.random() * 6) + 1;
	  while (k < howMany) {
	     System.out.println (forbiddenRoll(f));
	     k = k + 1;
	  }
   }
   

}
