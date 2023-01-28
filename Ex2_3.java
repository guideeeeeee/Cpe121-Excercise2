import java.util.Scanner;
public class Ex2_3 {
  public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int a = num.nextInt();
    if(a%3==0 && a%11==0)
      System.out.println(a+" is divisible by both 3 and 11");
    else if(a%3==0 || a%11==0)
      System.out.println(a+" is divisible by both 3 and 11, but not both");
    else 
      System.out.println(a+" is not divisible by either 3 or 11");
  }
}