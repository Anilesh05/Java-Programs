import java.util.Scanner;
public class D_Prime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line at the end

        scanner.close();
    }

    // Method to check if a number is prime
    
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false; // 0 and 1 are not prime
        }
        
        // Check for divisibility from 2 up to the square root of the number
        
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors found
    }
}