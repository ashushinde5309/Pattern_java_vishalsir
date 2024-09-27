package patterns;

public class Pattern23 {

	public static void main(String[] args) {
		int sp=1;
		int st=6;
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print((i+k)+" ");
				
			}
			sp++;
			st--;
			System.out.println(" ");
		}

	}

}
