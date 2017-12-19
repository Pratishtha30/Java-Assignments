import java.util.Scanner;

import java.util.InputMismatchException;

public class ExerciseHW_1 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int user_input;

System.out.println("\n\nWelcome to sorting program\n\n\t1.Title\n\t2. Rank\n\t3. Date\n\t4. Stars\n\t5. Likes\n\n ");

do{
    System.out.print("Enter your choice between 1 and 5 only: ");
try {
     user_input = input.nextInt();
   
    if(user_input >=1 && user_input <=5){
    break;// right input
    } else {
    System.out.println("You have not entered a number between 1 and 5. Try again.");
    continue;// continue looping if input is invalid
    }
}catch (final InputMismatchException e){

System.out.println("You have entered an invalid choice. Try again.");

input.nextLine();//discard invalid values
continue; // keep looping until you found right input
}
} while(true);

System.out.println("\nYou entered valid choice " + user_input);

System.out.println("Thank you for giving your choice");

}

}


