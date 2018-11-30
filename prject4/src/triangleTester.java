public class triangleTester
{
	public static void main (String[] args)
	{
		Triangle tester = new Triangle(-2, -2,1, 3,
				 3, -1);
		
		System.out.println(tester.getLengthA());
		System.out.println(tester.getLengthB());

		System.out.println(tester.getLengthC());

		System.out.println(tester.getAngleA());

		System.out.println(tester.getAngleB());

		System.out.println(tester.getAngleC());

	}
	
	}