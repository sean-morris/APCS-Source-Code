
public class TreasureHunt {

   int[] myClues = {0, 3, 99, 8, 2, 7, 9, 9, 4, 5};

   public TreasureHunt ( ) {
       for(int x = 0; x < myClues.length; x++)
       {
           int[] temp = new int[myClues.length];
           System.arraycopy(myClues, 0, temp, 0, myClues.length);
           boolean succeeds = huntSucceeds(x);
           myClues = temp;
           System.out.println(x + "::" + succeeds);
       }
   }
   
   // Plays the Treasure Hunt game, returning true
   // if we win and false if we lose..
   public boolean huntSucceeds (int start) {
        return true;
   }
}