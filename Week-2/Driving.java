import java.util.Scanner;

public class Driving
{
   public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Input total miles:");
    int miles = input.nextInt();

    System.out.print("Input cost per gallon of petrol:");
    int petrol = input.nextInt();

    System.out.print("Input cost for parking:");
    int parking = input.nextInt();

    System.out.print("Input cost for tolls:");
    int tolls = input.nextInt();

    int sum = (miles/petrol)+ parking + tolls;
    System.out.printf("The total driving cost is %d%n", sum);
   }
}   