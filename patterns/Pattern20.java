package patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int sp=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((i+k-1)+" ");
			}
			sp--;
			System.out.println(" ");
		}


	}

}
