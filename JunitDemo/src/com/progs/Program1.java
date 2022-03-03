package com.progs;
class BugException extends Exception
{
	public BugException(String message)
	{
		super(message);
	}
}
public class Program1 
{
	public int solution(String input) throws BugException
	{
			int count=0;
			char[] newinput = input.toCharArray();
			for(int i=0;i<newinput.length;i++)
			{
				if(!(Character.isLetterOrDigit(newinput[i]))){
					throw new BugException("Invalid Character");
				}
				else if(Character.isDigit(newinput[i]))
				{
					count=count+Character.getNumericValue(newinput[i]);
				}
		
			}
			return count;
	}
		
		
}

