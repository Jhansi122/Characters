package Char;

public class RepeatedCharacter 
{
 
	 public static int count(String s, char c)
	 {
		 int result = 0;
		 for(int i=0; i<s.length();i++)
		 {
			 if(s.charAt(i)== c)
				 result++;
                 
		 }
		 return result;
	 }
	 public static void main(String[] args)
	 {
		 String str = "Jhansi Lakshmi";
		 char c= 'a';
		 System.out.println(count(str,c));
		 
	 }
 }

