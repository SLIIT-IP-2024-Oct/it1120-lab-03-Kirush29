import java.util.Scanner;
public class IT24104106Lab3Q1B{
   public static void main(String []args){
     Scanner input=new Scanner(System.in);
	   
	   
		System.out.print("Enter the price of 1kg of rice:");
		double priceperkg=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		double numberofkgs=input.nextDouble();
		double totalamountwithdiscount=(priceperkg*numberofkgs)-(priceperkg*numberofkgs)*10/100;
		System.out.println();
		System.out.print("The total amount with 10% discountis:"+totalamountwithdiscount);
		
}
}