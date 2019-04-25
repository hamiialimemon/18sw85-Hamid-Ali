import java.util.Scanner;
public class UnitAndBill {
   public static void main(String args[]){
      int   units;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of units ");
      units = sc.nextInt();

  if(units <= 50){
      System.out.println("Price per unit in rupees is 10 ");
     }

     System.out.println("Enter the number of units ");
      units = sc.nextInt();

  if(units >= 50 && units <= 100  ){
      System.out.println("Price per unit in rupees is 15 ");
     }

     System.out.println("Enter the number of units ");
      units = sc.nextInt();

  if(units >= 101 && units <= 200  ){
      System.out.println("Price per unit in rupees is 20 ");
     }

   System.out.println("Enter the number of units ");
      units = sc.nextInt();

  if(units >= 201 && units <= 300  ){
      System.out.println("Price per unit in rupees is 25 ");
     }

   System.out.println("Enter the number of units ");
      units = sc.nextInt();

  if(units >= 301 ){
      System.out.println("Price per unit in rupees is 30 ");
     }
               
   }
}