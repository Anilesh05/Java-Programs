import java.util.Scanner;
public class A_Prime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("The given number is: " + num);

        int count = 0;

        if (num == 2)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                {
                    count++;
                }
            }

            if (count == 2)
            {
                System.out.println(num + " is a prime number");
            }

            else
            {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}