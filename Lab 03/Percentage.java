import java.util.Scanner;
public class  Percentage {
   public static void main(String args[]){
      float percentage;
      float total_marks;
      float scored;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your obtained marks of 3 subjects ::");
      scored = sc.nextFloat();

      System.out.println("Enter total marks ::");
      total_marks = sc.nextFloat();

      percentage = (float)((scored / total_marks) * 100);
      System.out.println("Percentage ::"+ percentage);
      if(percentage >= 90){
      System.out.println("Grade A");
}
      if(percentage >= 80 && percentage <= 90 ){
      System.out.println("Grade B");
}
      if(percentage >= 70 && percentage <= 79 ){
      System.out.println("Grade C");
}
      if(percentage >= 60 && percentage <= 69 ){
      System.out.println("Grade D");
}
      if(percentage < 60 ){
      System.out.println("FAIL");
}       
   }
}