package patterns;

public class Pattern22 {

	public static void main(String[] args) {
		int sp=1;
		int st=6;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<st;k++)
			{
				System.out.print("*"+" ");
			}
			sp++;
			st--;
			System.out.println(" ");
		}

	}

}
