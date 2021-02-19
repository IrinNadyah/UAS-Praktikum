import java.util.Scanner;
public class DesOktal {
   public static void main(String args[])
  {
    Scanner input = new Scanner( System.in );
    System.out.print("Masukan Bilangan Desimal : ");
    int num =input.nextInt();
    /* Method 1: 
     */
    String octalString = Integer.toOctalString(num);
    System.out.println("Method 1: Decimal to octal: " + octalString);
    /* Method 2: 
    int rem;
    String str=""; 
    // Digits in Octal number system
    char dig[]={'0','1','2','3','4','5','6','7'};
    while(num>0)
    {
       rem=num%8; 
       str=dig[rem]+str; 
       num=num/8;
    }
    System.out.println("Method 2: Decimal to octal: "+str);
  }
}
