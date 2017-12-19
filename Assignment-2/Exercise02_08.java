import java.util.Scanner;

public class Exercise02_08 {

public static void main(String[] args){
//prompt user to imput time zone
Scanner input = new Scanner(System.in);

System.out.println("Enter the time zone offset to GMT");

long timeZoneOffset = input.nextInt();

// Get the total milliseconds since the midnight Jan 1, 1970
long totalMilliseconds = System.currentTimeMillis();
//Get total seconds
long totalSecond = totalMilliseconds/1000;
//Get current seconds
long currentSecond = totalSecond%60;
//Get total minutes
long totalMinute = totalSecond/60;
//Get current minute
long currentMinute = totalMinute%60;
//Get total Hour
long totalHour = totalMinute/60;
//Get current hour
long currentHour = (totalHour + timeZoneOffset)%24;

System.out.println("Current Time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

 }
}  

