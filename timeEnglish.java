import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the hour (digits: _ _ ):");
		int hr=in.nextInt();
		System.out.println("Enter the minutes (digits: _ _) :");
		int min=in.nextInt();
		System.out.println(getTimeName(hr, min));
	}
	
	public static String getTimeName(int hours, int minutes)
	{
		String getTimeName;
		String hrSlot=" ";
		String minSlot;
		
		if (minutes ==45) 
		{ 
			minSlot="Quarter till";  
			if (hours ==12)
			{
				hours=1;
			}
			else 
				{
				hours=hours+1;
				}
		}
		else if (minutes ==0) { minSlot=" o' clock"; }
		else if (minutes ==15) { minSlot="quarter after"; }
		else if (minutes ==30) { minSlot="half past"; }
		else { minSlot=minutes +" minutes past"; }
		
		if (hours==1){hrSlot=" one";}
		else if (hours==2)	{hrSlot=" two";}
		else if (hours==3)	{hrSlot=" three";}
		else if (hours==4)	{hrSlot=" four";}
		else if (hours==5)	{hrSlot=" five";}
		else if (hours==6)	{hrSlot=" six";}
		else if (hours==7)	{hrSlot=" seven";}
		else if (hours==8)	{hrSlot=" eight";}
		else if (hours==9)	{hrSlot=" nine";}
		else if (hours==10)	{hrSlot=" ten";}
		else if (hours==11)	{hrSlot=" eleven";}
		else if (hours==12)	{hrSlot=" twelve";}
		
		if (minutes==0) {getTimeName=hrSlot+minSlot;}
		else {getTimeName=minSlot+hrSlot;}
		return getTimeName;
	}

}
