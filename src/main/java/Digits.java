import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
digitList = new ArrayList <Integer>();  
    if (num == 0) {
            digitList.add(0);
        } else {
            while (num > 0) {
                digitList.add(0, num % 10); // insert at front to maintain order
                num /= 10;
            }
        }
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
