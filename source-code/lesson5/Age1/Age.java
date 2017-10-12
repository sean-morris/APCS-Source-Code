/** 
 * Ages between 13 and 19, inclusive, are teenage years.
 * 
 * Fill in the blank in the ageType() method so that ageType 
 * receives the correct results.
 */

public class Age {

   private String ageType;
   private int age;

   // teenagers are between 13 and 19 inclusive...
   public String ageType(){
      if (                                 ) {
         ageType = "teenage";
      } else {
         ageType = "other";
      }
      return ageType;
   }

  public void setAge(int a){
      age = a;  
  }
}
