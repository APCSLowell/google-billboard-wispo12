

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public void setup()
		{
		for(int i=2;i<e.length()-10;i++)
			{
			String hi=e.substring(i,i+10);
			double num1=Double.parseDouble(hi);
			if(isPrime(num1))
				{
				break;
				}
			i++;
			}
			ArrayList<Double> arr=new Arraylist<Double>();
			for(int i = 2; i < e.length() - 9; i++) {
 				String num = e.substring(i, i+10);
				 double sum = 0;
						
			for(int n = 0; n < num.length(); n++) {
 				double c = Double.parseDouble(num.substring(n, n+1));
				 sum += c;
 			 }
			if(sum==49)
				{
				double d=Double.parseDouble(num);
				arr.add(b);
				}
			}
		System.out.println(arr.get(0));
System.out.println(arr.get(1));
System.out.println(arr.get(2));
System.out.println(arr.get(3));
System.out.println(arr.get(4));
System.out.println(arr.get(4));
				
		}
	

		public static void main(final String[] args) {
		System.out.println("Replace this string with your answer!");
	}

	//Finish this function
	public boolean isPrime(double d)
	{
		if(num1<=1)
			{
			return false;
		for(int k=2;k<=Math.sqrt(num1);i++)
			{
			if(num1%k==0)
			{
			return false;
			}
			}
				return true;
	}

}

