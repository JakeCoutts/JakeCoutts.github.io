import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <center><h2>The Child Calculator</h2><center>
 * 
 * <p>Write a program that prompts for the gender of the child, the height of the
 * father, and the height of the mother, then calculates and prints the estimated 
 * adult height of the child.
 * 
 * <p>This is a program that will take the height of the mother,
 * the height of the father, and the child's gender, to calculate how
 * tall the child will be.
 * 
 * <P>First, the user will enter the height of each parent in inches.
 * <p>Then they will enter the gender ofthe baby.
 * <p>Lastly the calculation will run displaying the estimated height of the baby
 * when they grow up.
 *
 * @author Jake Coutts
 * @version Module 6 / Homework 6
 */
public class ChildHeight
{
   public static void main(String[] args){
       
    //Instance Variables
    int momHeight = 0;
    int dadHeight = 0;
    int childGender = 0;
    int childHeight = 0;
    String theChildGender;
    int dFeet = 0;
    int dInches = 0;
    int mFeet = 0;
    int mInches = 0;
    int cFeet = 0;
    int cInches = 0;
   
    DecimalFormat df = new DecimalFormat(".0");
   
    //Prompts the user to enter the dad's height in inches.
      System.out.println("Please enter the height of the father in inches:");
      Scanner dad = new Scanner(System.in);
      dadHeight = dad.nextInt();
      
    //Prompts the user to enter the mom's height in inches.
      System.out.println("\nPlease enter the height of the mother in inches:");
      Scanner mom = new Scanner(System.in);
      momHeight = mom.nextInt();
      
    //Prompts the user to enter the child's gender.
      System.out.println("\nLastly, enter the gender of the child, type '1' for boy, or '2' for girl:");
      Scanner gender = new Scanner(System.in);
      childGender = gender.nextInt();
      
    //Find the dad's height.
     dFeet = dadHeight / 12;
     dInches = dadHeight % 12;
     
    //Find the dad's height.
     mFeet = momHeight / 12;
     mInches = momHeight % 12;
   
    //Finds the child's gender.
       if(childGender == 1){
         theChildGender = ("boy");
     }
     else{
         theChildGender = ("girl");
     }
     
     //Print out entered results.
     System.out.println("\nAccording to the data you submitted, you said that ");
     System.out.println("your dad's height is " + dFeet + "' " + dInches
     + "'' tall.");
     System.out.println("And that your mom's height is " + mFeet + "' " 
     + mInches + "'' tall.");
     System.out.println("You also entered that your child is confirmed to be a "
     + theChildGender + ".");
     
     //Finding the child's height.
     if (childGender == 1){
         childHeight = ((momHeight * 13 / 12) + dadHeight) / 2;
    }
     if (childGender != 1) {
        childHeight = ((dadHeight * 12 / 13) + momHeight) / 2;
    }
     cFeet = childHeight / 12;
     cInches = childHeight % 12;
     
     //Prints out the final results.
     System.out.println("\nAfter running a few(many) calculations, your child will on average ");
     System.out.println("be a " + cFeet + "' " + cInches + "'' tall " + theChildGender + ".");
    }
}
