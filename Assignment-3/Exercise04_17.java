import java.util.Scanner;

public class Exercise04_17{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a year and first three letters of a month(uppercase)");

int year = input.nextInt();

String month = input.next();

int number_days = 0;

if(month.equals("JAN")||month.equals("MAR")||month.equals("MAY")||month.equals("JUL")||month.equals("AUG")||month.equals("OCT")||month.equals("DEC"))
  
  System.out.println( month + " " + year +" has 31 days");

else if(month.equals("APR")||month.equals("JUN")||month.equals("SEP")||month.equals("NOV"))
  
  System.out.println( month + " " + year +" has 30 days");

else if(month.equals("FEB"))

   if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)

     System.out.println(month +" " + year +" has 29 days");
else 
     System.out.println(month + " " + year +" has 28 days");  
else
     System.out.println("Invalid month " + month);
 }
}

