package org.sample;

public class ReverseString
{
	
	

	public static void main(String[] args) {
		
		String S1 = "welcome to java class";
		String S2 = "";
		
		String[] S3 = S1.split(" ");
		
		for(String S4:S3)
		{
			String S5 ="";
			int i;
			for(i = S4.length()-1; i >=0; i--)
			{
			char c = S4.charAt(i);
				S5 = S5 +c;
			}	
					S2 = S2 + S5 +" ";
					
			}
		System.out.println(S2);
		}
		

	}


