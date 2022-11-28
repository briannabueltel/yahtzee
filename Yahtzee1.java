
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */


public class Yahtzee
{

  /**
   * Contains the current value of the die
   */
  private Die6 die1;
  private Die6 die2;
  private Die6 die3;
  
  private int value;

  /**
   * Constructor Sets each die to its initial value
   */
  // asking for an integer to roll that specific die
  public Yahtzee() {
      die1 = new Die6();
      die2 = new Die6();
      

    }
public void roll() {
    die1.roll();
    die2.roll();
    
  }  
  
public void roll(int dieNumber) {
    if (dieNumber == 1) {
        die1.roll();
    } else if (dieNumber == 2) {
        die2.roll();
    }
}    
  // when toString is called, it expects an integer list
  public String toString(int[] dieArray) {
 // stores what it is going to hand back
 // formats it to list the values of the 5 dice as a string
    String returnString = "Dice values:  ";
   // adds the values to the string so it can list them
    for (int i = 0; i < dieArray.length; i++) {
    // changes returnString so it lists the values after "Dice values: "
      returnString = returnString + Integer.toString(dieArray[i]) + " ";
    }
    // returns the new returnString with the values of the dice added 
    // tells the computer to return to wher it came from with the new string
      return returnString;   
  }  
  // when Summarize is called, it expects a list of integers
  // summarize looks at each number and counts how many there are
  public String Summarize (int[] dieArray) {
      // sets up a empty string to use as the return result
    String returnString = "";
    //sets up the variable for the number of each value
    int countValue1 = 0;
    int countValue2 = 0;
    int countValue3 = 0;
    int countValue4 = 0;
    int countValue5 = 0;
    int countValue6 = 0;    
    // loops through thee list of dice values
   for (int i = 0; i < dieArray.length; i++) {
       // finds what the value of the specific integer it is on in the array
       // once it finds the correct value it adds 1
      if (dieArray[i] == 1) {
          countValue1 = countValue1 + 1;
      }
      if (dieArray[i] == 2) {
          countValue2 = countValue2 + 1;
      }
      if (dieArray[i] == 3) {
          countValue3 = countValue3 + 1;
      }
      if (dieArray[i] == 4) {
          countValue4 = countValue4 + 1;
      }
      if (dieArray[i] == 5) {
          countValue5 = countValue5 + 1;
      }
      if (dieArray[i] == 6) {
          countValue6 = countValue6 + 1;
      }      
    }    
     // returns the string with the values and how many values there are of that specific value after a hyphen 
      returnString = "1-" + Integer.toString(countValue1) + "; " + "2-" + Integer.toString(countValue2) + "; " 
      + "3-" + Integer.toString(countValue3) + "; " + "4-" + Integer.toString(countValue4) + "; " 
      + "5-" + Integer.toString(countValue5) + "; " + "6-" + Integer.toString(countValue6);
      // returns the new string to where it came from
      return returnString;
  }    
}




