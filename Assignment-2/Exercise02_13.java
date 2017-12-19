import java.util.Scanner;

public class Exercise02_13{
 
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the monthly saving account");

double monthlyDeposit = input.nextDouble();

int i;

double currentValue = monthlyDeposit;

currentValue = currentValue * (1 + .00417);
// First month value
System.out.println("Account value after 1 month is " + currentValue);
// Value for month 1 to 6
for(i=2; i<=6; i++){

currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);

System.out.println("Account value after " + i + " month is " + currentValue);
  }
 }
}

