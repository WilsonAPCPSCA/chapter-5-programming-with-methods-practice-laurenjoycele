import java.util.Scanner;
public class romanNumberals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		do
		{
		System.out.print("Enter an integer between the exclusive interval (0,1000):");
		n=in.nextInt();
		}
		while (n<=0 || n>=1000);
		System.out.println(romanDigit(n/100, "C", "D", "M")+ romanDigit((n/10)%10, "X","L","C")+romanDigit(n%10, "I", "V", "X"));
	}

	
	public static String romanDigit(int n, String one, String five, String ten)
	{
		String onesDigit="";
		
		//n is the number
		if (n<4)
		{
			for (int i=0; i<n; i++)
			{
			onesDigit+=one;//I, II, III
			}
		}
		else if (n==4) {onesDigit=one+five;}//IV
		else if (n>=5 && n<9)//V to VIII
		{
			onesDigit=five;
			for (int i=0; i<n-5; i++)
			{
				onesDigit+=one;
			}
		}
		else if (n==9){onesDigit=one+ten;}//IX
		
		
		return onesDigit;
		
		
		
		
	}


}
