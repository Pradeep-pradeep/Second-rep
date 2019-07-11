import java.util.Scanner;
class ifelseif 
{
	public static void main(String[] args)
	{
		while (true)
		{
			Scanner Score=new Scanner(System.in);
		System.out.println("Enter Marks");
		int Marks=Score.nextInt();
		if (Marks<35)
		{
			System.out.println("fail");
		}
		else if (Marks>=35&&Marks<50)
		{
			System.out.println("Second class");
		}
		else if (Marks>=50&&Marks<75)
		{
			System.out.println("First class");
		}
		else if (Marks>=75&&Marks<100)
		{
			System.out.println("Distintsion");
		}
		else if (Marks==100)
		{
			System.out.println("Gold Medal");
		}
		else 1
		{
			System.out.println("if he scores more than 100 kick him out of the program bye bye ");
			System.exit(0);
		}
		}
	}
}