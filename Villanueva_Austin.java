// Villanueva_Austin.java
// Austin Villanueva, NID: au563482
// main execution file that also has code for the histograms

package assignment2;

// execution class
public class Villanueva_Austin {
  // main method
  public static void main(String[] args) {
    // init dice and frequency array
    Dice myDice = new Dice();
    int[] freq = new int[13];

    // 'roll' the dice 1000 times
    for(int i = 0; i < 1000; i++){
      freq[myDice.getNums()]++;
    }

    // print results
    for(int i = 2; i < 13; i++){
      System.out.println("Number of " + i + "s are " + freq[i]);
    }

    // print the histogram
    System.out.println("Graph");
    for (int i = 175; i >= 0; i -= 25) { 
      System.out.printf("%3d|", i);
      for (int j = 2; j < 13; j++) {
        if (freq[j] >= i) {
          System.out.print("*  ");  
        } 
        else {
          System.out.print("   ");
        }
      }
      
      System.out.println();
    }

    System.out.println("    --------------------------------");
    System.out.println("    2  3  4  5  6  7  8  9 10 11 12");
  }
}
