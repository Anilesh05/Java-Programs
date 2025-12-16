import java.util.Scanner;
public class Check {
  public static void main(String[] args) 
  {
    Scanner ob = new Scanner(System.in);  
    System.out.println("Enter a number");
    int n = ob.nextInt(); 
    trynumber(n);
  }

  public static void trynumber(int n)
 {
    try {
      checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException(number + " is odd.");
    }
  }
}
