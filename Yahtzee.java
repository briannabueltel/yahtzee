
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
  private int value;

  /**
   * Constructor Sets each die to its initial value
   */
  // asking for an integer to roll that specific die
  public Yahtzee(int DieN) {
    //set up Yahtzee to be able to use the Die6 class; setting up a new die
    Die6 rollMyDie = new Die6();
    // array to store all the result from the roll; initialized all to zero b/c we haven't rolled yet
    // [] means array / multiple values in 1 variable
    int[] dieArrayRoll = new int[] {0,0,0,0,0};
    // changes what the user inputs into the program to the correct array index
    // ex: if user plugs in "5" the program will change it to "4" so the program outputs the value of the correct die
    int DieToRoll = DieN - 1;
    // rolls the die that the user plugged in and stores it in the array in the proper index
    // "this.roll" tells the computer to find the roll method with (int DieN) and run it. it leaves DieN and comes back after roll is finished running
    dieArrayRoll[DieToRoll] = this.roll(dieArrayRoll[DieToRoll]);
    // tells computer to put the result on the screen. Goes to toString method. Passes the entire list into toString
    // prints the string with the list of dice values
    System.out.println(toString(dieArrayRoll));
    // tells computer to go to Summarize with the array of dice values
    // prints the string of number of values
    System.out.println(Summarize(dieArrayRoll));
  }
  // not asking for anything because it is rolling all of them
  public Yahtzee() {
    //set up Yahtzee to be able to use the Die6 class
    Die6 rollMyDie = new Die6();
    int[] dieArrayRollAll = new int[] {0,0,0,0,0};
    // doesn't pass a die number that the user inputs. so it will roll all the dice
    dieArrayRollAll = this.roll();
    System.out.println(toString(dieArrayRollAll));
    System.out.println(Summarize(dieArrayRollAll));
  }  
  
public int roll(int DieN) {
// set up the Die6 class for a new instance of the class, tells computer youre going to use the Die6 class
  Die6 rollMyDie = new Die6();
// using die6 class and methods, rolls the die & gets the result
   int result = rollMyDie.rollAndGetValue();
// tells the computer to return to where it came from with the result
    return result;
  
  }  
  
public int[] roll() {
  Die6 rollMyDie = new Die6();
   int[] dieArray = new int[] {0,0,0,0,0};
   // loop rolls each dice, not just 1
   // stores every roll in the array
    for (int i = 0; i < 5; i++) {
      dieArray[i] = rollMyDie.rollAndGetValue();
    }
    // returns the array/whole list of rolls
    return dieArray;
  
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




class Die6
{
  /**
   * Contains the current value of the die
   */
  private int value;

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Die6() {
    this.roll();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    this.value = (int)(Math.random() * 6) + 1;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}




