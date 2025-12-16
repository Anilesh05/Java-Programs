public class JavaException
{
public static void main(String args[])
{
int a = 20;
int d = 10;
try 
{
int c = a / 0;
}
catch(Throwable e)
{
System.out.println("Logical Error");
}
int g = a - d;
System.out.println(g);
}
}
