/*
1.11 The US Census Bureau projects population based on the following assumptions:
1. one birth every 7 seconds
2. one death every 13 seconds
3. one new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days.
*/

public class Exercise01_11 {
  public static void main(String[] args) {
  
  for(int i=1; i<=5; i++){
   System.out .println("Population in " + i + " year " + (312032486 + i * 365 * 24 * 60 * 60 / 7.0 - i *365 * 24 * 60 * 60 / 13.0 + i * 365 * 24 * 60 * 60 / 45.0));
   }
  }
}

