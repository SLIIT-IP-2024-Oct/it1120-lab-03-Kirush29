public class IT24104106Lab3Q1B{
  public static void main (String[]args){
   int priceof1kgofrice=225;
   int numberofkgsyouwanttobuy=5;
   double totalamount=(priceof1kgofrice*numberofkgsyouwanttobuy);
   double discount=totalamount*0.1;
   double thetotalamountwithdiscount=totalamount-discount;
   System.out.println("Enter the price of 1kg of rice:" +priceof1kgofrice);
    System.out.println("Enter the number of kgs you want to buy:" +numberofkgsyouwanttobuy);
    System.out.println();
    System.out.println(" The total amount with 10% discount is :"+ thetotalamountwithdiscount);

    }
}
    


   