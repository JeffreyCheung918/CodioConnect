import java.util.Scanner;

public class Pratical{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter min value:");
        int min = input.nextInt();

        System.out.print("Enter max value:");
        int max = input.nextInt();

        for(int number=min; number<=max; number++) {
            if (number % 2 == 1);
            if (number <= 100);
            if (number % 5 == 0){
                System.out.println(number*3);
            }
                else {
                    System.out.println(number);
                }
        
        }
   }
}