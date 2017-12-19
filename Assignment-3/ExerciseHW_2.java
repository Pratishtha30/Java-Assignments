import java.util.Scanner;

import java.util.InputMismatchException;

public class ExerciseHW_2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("\n Welcome to two float numbers program \n");

float float_no1 = 0.0f;
float float_no2 = 0.0f;

do {
  System.out.println("Please enter float numbers separated by space and press enter : ");
try {

  float_no1 = input.nextFloat();
  float_no2 = input.nextFloat();
  
  break;

}catch(final InputMismatchException e){

System.out.println("You have entered an invalid input. Please try again."); 
input.nextLine();
continue;
}
}while(true);

System.out.println("\nYou entered two valid floats: " + float_no1 + " and " + float_no2);
System.out.println("Thank you for giving two floats");
  }
}

