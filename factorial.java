import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int n,x=1;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			x=x*i;
		}
		System.out.println("factorial : "+x);
	}
}