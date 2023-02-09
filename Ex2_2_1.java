import java.util.Scanner;
public class Ex2_2_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer:");
    int sum = 0;
    String n = sn.nextLine();
    int num = Integer.parseInt(n);
    for(int i=0;i<9;i++){
      sum = sum+((int)((num/Math.pow(10,i))%10)*(9-i));
      System.out.print((int)((num/Math.pow(10,i))%10)+" i="+(9-i)+" ");
      System.out.println(sum);
    }
    int d10 = sum%11;
    System.out.println("D10 = "+d10);
    if (d10 ==10)
      System.out.println("The ISBN-10 number is "+n+"X");
    else
      System.out.println("The ISBN-10 number is "+n+""+d10);
  }
}
