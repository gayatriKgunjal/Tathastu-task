import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char operation;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      operation = sc.next().charAt(0);
      switch(operation) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.println("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + ans);
   }
}