package patterns;

public class Pattern30 {

	public static void main(String[] args) {
		int size=7;
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                 
                if (j == i || j == (size - i - 1)) 
                {
                    System.out.print("x");
                }
                else 
                {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }

	}


