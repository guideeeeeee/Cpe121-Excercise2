import java.util.Random;
import java.util.Scanner;
public class Ex2_4{
  public static void main(String[]args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int randomNum = rand.nextInt(7);
    System.out.print("Guess the roll [1-6]:");
    int guess = scan.nextInt();
    if (guess == randomNum)
      System.out.println("Your guess is correct");
    else
      System.out.println("Your guess is incorrect");
}
}