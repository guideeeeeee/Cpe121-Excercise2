import java.util.Scanner;
public class Ex2_2{
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer:");
    String isbn = input.nextLine();
    String d1_d9 = isbn.substring(0,9);
    int sum = 0;
    for(int i = 0;i<9;i++){
      int digit = Integer.parseInt(d1_d9.substring(i,i+1));
      sum += digit *(10-i);
    }
    int remainder = sum%11;
    int d10 = 11 - remainder;
    if(d10==10){
      char dre = 'x';
      System.out.println("The 10th digit is "+d1_d9+""+dre);
    }
    else
    System.out.println("The 10th digit is "+d1_d9+""+d10);
  }
  
}