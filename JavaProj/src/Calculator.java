import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		int i, j, Sum = 0, Sub = 0, Mul = 0, k = 0;
		Scanner SC1 = new Scanner(System.in);
		Scanner SC2 = new Scanner(System.in);
		Scanner SC3 = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		i = SC1.nextInt();
		System.out.println("Enter the Second number : ");
		j = SC2.nextInt();
		System.out.println("Please mention the function : For Addition Press 1");
		System.out.println("Please mention the function : For Subtraction Press 2");
		System.out.println("Please mention the function : For Multiplication Press 3");
		k = SC3.nextInt();
		{
			if (k==1) 
			{
				Sum = i+j;
				System.out.println("Sum of the numbers are : " + Sum);
			}
			else if (k==2)
			{
				Sub = i+(-j);
				System.out.println("Subtraction of the numbers are : " + Sub);
			}
			else if (k==3)
			{
				Mul = i*j;
				System.out.println("Multiplication of the numbers are : " + Mul);
			}
			else 
			{
			System.out.println("Please enter correct number.");
			}
		}
	}
}