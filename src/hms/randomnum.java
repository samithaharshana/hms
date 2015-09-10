/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import java.util.Random;

/**
 *
 * @author Samitha
 */


/** Generate 10 random integers in the range 0..99. */
public final class randomnum {
  
  public static final void main(String... aArgs){
   
    //note a single Random object is reused here
    
    
    
  }
  
  public static int empid(){
      Random randomGenerator = new Random();
   
      int rand = randomGenerator.nextInt(10000);
     
    return rand;
  }
}
 