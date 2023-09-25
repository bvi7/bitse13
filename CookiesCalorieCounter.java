import java.util.Scanner;

class CookiesCalorieCounter
{ 
    
 public static void main(String[] args) 
  {
    Scanner cc = new Scanner(System.in);
 
    int cookieCount = cc.nextInt();
 
    int servingSize = 40/10;
    int caloriesPerCookie = 300/servingSize;
    int totalCalories = cookieCount * caloriesPerCookie;
 
 
    System.out.println("Enter how many cookies you ate: ");
    cookieCount = cc.nextInt();

    System.out.println("Your calorie intake was:  " + totalCalories + " calories.");  
      
  }
}