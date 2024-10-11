// Dice.java
// Austin Villanueva, NID: au563482
// file that contains the dice class

package assignment2;

// dice class
public class Dice {
  // attributes
  private Die d1;
  private Die d2;

  // constructor
  public Dice(){
    this.d1 = new Die();
    this.d2 = new Die();
  }

  // returns the sum of the rolled dice
  public int getNums(){
    this.d1.roll();
    this.d2.roll();

    return this.d1.getFaceValue() + this.d2.getFaceValue();
  }
}
