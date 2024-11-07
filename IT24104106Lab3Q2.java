import java.util.Scanner;
public class IT24104106Lab3Q2{
 public static void main(String[]args){
  Scanner input=new Scanner(System.in);
  System.out.print("Enter the monthly salary:");
  double monthlysalary=input.nextDouble();
  System.out.print("Enter the number of Ot hours:");
  double othours=input.nextDouble();
  System.out.print("Enter the OT hourly rate:");
  double othourlyrate=input.nextDouble();
  System.out.println();
  double totalsalary=monthlysalary+(othours*othourlyrate);
  System.out.println("The total salary including OT is:"+totalsalary);
 }
}
  