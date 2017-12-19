import java.util.Scanner;

public class Exercise02_06{
 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

 System.out.println("Enter a number between 0 and 1000");
 int number = input.nextInt();

int ThirdDigit = number%10;
int RemainingNumber = number/10;
int SecondDigit = RemainingNumber%10;
RemainingNumber = number/100;
int FirstDigit = RemainingNumber%10;

int SumOfDigits= ThirdDigit + SecondDigit + FirstDigit;

System.out.println("The sum of digits of " + number + " is "+ SumOfDigits);
 }
}

