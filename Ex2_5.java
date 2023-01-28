import java.util.Random;
import java.util.Scanner;
public class Ex2_5{
  public static void main(String[]args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int randomNum = rand.nextInt(2);
    System.out.print("scissor (0), rock(1),paper(2):");
    int guess = scan.nextInt();
    switch(guess){
      case 0: 
        if(randomNum==0)
        System.out.println("The computer is scissor. You are scissor too. It is a draw.");
        else if(randomNum==1)
        System.out.println("The computer is rock. You are scissor. You lose.");
        else 
        System.out.println("The computer is paper. You are scissor. You won.");
        break;
      case 1:
        if(randomNum==0)
        System.out.println("The computer is scissor. You are rock. You won.");
        else if(randomNum==1)
        System.out.println("The computer is rock. You are rock too. It is a draw.");
        else 
        System.out.println("The computer is paper. You are rock. You lose.");
        break;
      case 2:
        if(randomNum==0)
        System.out.println("The computer is scissor. You are paper. You lose.");
        else if(randomNum==1)
        System.out.println("The computer is rock. You are paper. You won.");
        else 
        System.out.println("The computer is paper. You are paper too. It is a draw.");
        break;
      default: 
        System.out.println("Error Invalid Value");
}
    System.out.println("Goodbye");
  }
}