import java.util.Scanner;

public class SimpleInterest {

 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 System.out.print(“Enter principal amount: “);

 double principal = input.nextDouble();

 System.out.print(“Enter rate of interest: “);

 double rate = input.nextDouble();

 System.out.print(“Enter time period in years: “);

 double time = input.nextDouble();

 double simpleInterest = (principal * rate * time) / 100;

 System.out.println(“Simple Interest: ” + simpleInterest);

 }

}

/*
Output:

Enter principal amount: 5000

Enter rate of interest: 2.5

Enter time period in years: 3

Simple Interest: 375.0
*/
