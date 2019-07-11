import java.util.Scanner;
class ifelseexample 
{
	public static void main(String[] args) 
	{
		Scanner num=new Scanner(System.in);
		System.out.println("enter number");
		int number=num.nextInt();
		if (number%2==0)
		{
			System.out.println("even num");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
