
public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate c = new calculate();
		System.out.println(c.add());
		System.out.println(c.subtract());
		System.out.println(c.multiply());
		System.out.println(c.divide());
		
		calculate c1 = new calculate(4,5);
		System.out.println(c1.add());
		System.out.println(c1.subtract());
		System.out.println(c1.multiply());
		System.out.println(c1.divide());
		
		
	}

}
