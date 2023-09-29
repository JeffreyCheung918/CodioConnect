import java.util.Scanner;

public class EscapeSequences
{
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

   System.out.print("Input First number:");
   int number1 = input.nextInt();

   System.out.print("Input second number:");
   int number2 = input.nextInt();

   int sum = number1 + number2;
   System.out.printf("The sum is %d%n",sum);
   }
}
