public class Exercise04_25 {

public static void main(String[] args) {

char char1 = (char)('A' + (int)(Math.random() * 26));

char char2 = (char)('A' + (int)(Math.random() * 26));

char char3 = (char)('A' + (int)(Math.random() * 26));

char char4 = (char)('0' + (int)(Math.random() * 10));

char char5 = (char)('0' + (int)(Math.random() * 10));

char char6 = (char)('0' + (int)(Math.random() * 10));

char char7 = (char)('0' + (int)(Math.random() * 10));

String vehiclePlateNumber = "" + char1 + char2 +  char3 +  char4 + char5 + char6 + char7;

System.out.println("The vehicle plate number is " + vehiclePlateNumber); 

}

}

 
