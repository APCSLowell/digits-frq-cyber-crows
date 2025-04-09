import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	  ArrayList <Integer> digitList = new ArrayList <Integer>();  
    if(num==0)
      digitList.add(0);
    for (int i=0;i>digitList.size();i++)
      digitList.add(num/10,num%10);
    return digitList;   
	}

	public boolean isStrictlyIncreasing()
	{ 
	 int lastvalue=0;
   for(int i=0; i < digitList.size(); i++){
     if(digitList.get(i)<=lastvalue)
       return false; 
    if(digitList.get(i)> lastvalue)
      lastvalue=digitList.get(i);	
	}
	return true; 
	}
	public String toString()
	{
		return digitList.toString();
	}
}
