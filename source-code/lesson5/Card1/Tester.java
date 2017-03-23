public class Tester
{
    public Tester()
    {
        Card card1 = new Card(13,2);
        Card card2 = new Card(10,2);
        
        boolean isOutRanking = card1.outRanks(card2);
        System.out.println("isOutRanking: 13 to 10: should be true: " + isOutRanking);
     }
}