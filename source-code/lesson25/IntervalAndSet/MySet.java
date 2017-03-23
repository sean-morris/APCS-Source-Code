public class MySet
{
    private int[] myElements;
    private int myElementCount;
    public MySet(int count)
    {
        myElements = new int[count];
        myElementCount = count;
        for(int x = 0; x < count; x++){
            myElements[x] = (int)(Math.random() * 10);
        }
    }
    
    public int contains(int x){
        return containsHelper(x, 0);
    }
    
    private int containsHelper(int value, int index){

        
        
        
    }
    
    /**
     * This should remove all instances of value from myElements
     */
    public int remove(int value){
        return removeHelper(value, 0);
    }
    
    /**
     * Removing a value means:
     *  1) descrease myElementCount
     *  2) replace the last value in the set at the index 
     *     of the removed value
     *  3) return the number of elements removed
     */
    public int removeHelper(int value, int index){
      
    }
        
}