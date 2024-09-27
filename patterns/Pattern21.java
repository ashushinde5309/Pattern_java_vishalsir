package patterns;

public class Pattern21 {

	public static void main(String[] args) {
		int sp=5;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(n+" ");
				n++;
			}
			
			sp--;
			System.out.println(" ");
		}


	}

}
