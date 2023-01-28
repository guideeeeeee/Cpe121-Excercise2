import java.util.Scanner;
public class Ex2_8{
  public static void main(String[]args){
    Scanner key = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates :");
    Double x = key.nextDouble();
    Double y = key.nextDouble();
    if (Math.abs(x)<=(10/2) && (Math.abs(y)<=(2.5)))
      System.out.println("Point ("+x+","+y+") is in the rectangle.");
    else
      System.out.println("Point ("+x+","+y+") is not in the rectangle.");
  }
}