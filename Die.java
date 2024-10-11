// Die.java
// Austin Villanueva, NID: au563482
// file that contains the die class

package assignment2;

import java.util.Random;

// die class
public class Die {
  // attributes
  private int faceValue;

  // constructor
  public Die(){
    this.faceValue = 1;
  }

  // returns the current face value
  public int getFaceValue(){
    return this.faceValue;
  }

  // set the face value to a given number
  public void setFaceValue(int num){
    this.faceValue = num;
  }

  // 'roll' the die
  public void roll(){
    Random random = new Random();
    int newFace = random.nextInt(6) + 1;

    this.faceValue = newFace;
  }
}
