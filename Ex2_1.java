import java.util.Scanner;
public class Ex2_1 {
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a b c d e f :");
    Double a = scan.nextDouble();
    Double b = scan.nextDouble();
    Double c = scan.nextDouble();
    Double d = scan.nextDouble();
    Double e = scan.nextDouble();
    Double f = scan.nextDouble();
    Double x =((e*d)-(b*f))/((a*d)-(b*c));
    Double y =((a*f)-(e*c))/((a*d)-(b*c));
    e =(a*c) + (b*y);
    f =(a*x) + (d*y);
    System.out.println("x is "+x+" and y is "+y);
    
  }
}