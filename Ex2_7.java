import java.util.Scanner;
public class Ex2_7{
  public static void main(String[]args){
    Scanner key = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates :");
    Double x = key.nextDouble();
    Double y = key.nextDouble();
    Double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    if (distance <=10)
      System.out.println("Point ("+x+","+y+") is in the circle.");
    else
      System.out.println("Point ("+x+","+y+") is not in the circle.");
  }
}
