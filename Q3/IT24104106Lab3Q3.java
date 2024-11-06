public class IT24104106Lab3Q3{
  public static void main (String[]args){
   int rupeeamount=2754;
   int notes5000=rupeeamount/5000;
   int remainder1=rupeeamount % 5000;
   int notes1000=(remainder1)/1000;
   int remainder2=(remainder1)%1000;
   int notes500=(remainder2)/500;
   int remainder3=(remainder2)%500;
   int notes200=(remainder3)/200;
   int remainder4=(remainder3)%200;
   int notes100=(remainder4)/100;
   int remainder5=(remainder4)%100;
   int notes50=(remainder5)/50;
   int remainder6=(remainder5)%50;
   int notes20=(remainder6)/20;
   int remainder7=(remainder6)%20;
   int coins10=(remainder7)/10;
   int remainder8=(remainder7)%10;
   int coins05=(remainder8)/5;
   int remainder9=(remainder8)%5;
   int coins02=(remainder9)/2;
   int remainder10=(remainder9)%2;
   int coins01=remainder10;
    System.out.println("Enter the Rupee amount-"+rupeeamount);
    System.out.println();
    System.out.println("5000 notes-" +notes5000);
    System.out.println("1000 notes-" +notes1000);
    System.out.println("500 notes-" +notes500);
    System.out.println("200 notes -"+ notes200);
    System.out.println("100 notes-" +notes100);
    System.out.println("50 notes-" +notes50);
    System.out.println("20 notes-" +notes20);
    System.out.println("10 coins-" +coins10);
    System.out.println("05 coins-" +coins05);
    System.out.println("02 coins-" +coins02);
    System.out.println("01 coins-"+coins01);

    }
}
    


   