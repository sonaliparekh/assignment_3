
public class calculate {

	int num1,num2;
	
	calculate()
	{
		num1 = 4;
		num2 = 2;
	}
	calculate(int a,int b)
	{
		num1 = a;
		num2 = b;
	}
	public int add()
	{
		return num1 + num2;
	}
	
	public int subtract()
	{
		return num1-num2;
	}
	
	public int multiply()
	{
		return num1*num2;
		
	}
	public double divide()
	{
		return num1/num2;
	}
}
