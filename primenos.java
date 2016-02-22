public class primenos
{
	 int num1;
	
  public void  prime(int num1){
	  int i;
	 for(i=2;i<=num1;i++)
	 {
		 if(num1%i ==0)
			 break;
		 
	 }
	 if(i==num1)
	 {
		 System.out.println("number is prime ");
		 //return 1;
	 }
	 else 
	 {
		 System.out.println("Number is not prime ");
		 //return 0;
	 }
 }
}  
