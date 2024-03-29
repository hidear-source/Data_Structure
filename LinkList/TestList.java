public class TestList
{
	public static void main(String[] args)
	{
		List a = new List(10);
		List b = new List(5,3);
		List c = new List(5);
				
		c.setBase(6);
		
		System.out.println("The size of list a is " + a.getSize());
		System.out.println("The size of list b is " + b.getSize());
		System.out.println("The size of list c is " + c.getSize());
		System.out.println();

		System.out.println("The base of list a is " + a.getBase());
		System.out.println("The base of list b is " + b.getBase());
		System.out.println("The base of list c is " + c.getBase());
		System.out.println();

		a.setElement(1,"hello");
		b.setElement(2,"hi");
		c.setElement(8,"test");

		System.out.println("The 1st element of list a is " + a.getElement(1));
		System.out.println("The 2nd element of list b is " + b.getElement(2));
		System.out.println("The 3rd element of list c is " + c.getElement(8));
		System.out.println();

		System.out.println("The 10th element of list a is " + a.getElement(10));
		System.out.println("The 5th element of list b is " + b.getElement(5));
		System.out.println("The 5th element of list c is " + b.getElement(5));
		System.out.println();

		a.expand(1);
		b.expand(2);
		c.expand(20);

		a.setElement(0,"dear");
		b.setElement(4,"hidear");
		c.setElement(18,"element");

		System.out.println("The size of list a is " + a.getSize());
		System.out.println("The size of list b is " + b.getSize());
		System.out.println("The size of list c is " + c.getSize());
		System.out.println();

		System.out.println("The 0 element of list a is " + a.getElement(0));
		System.out.println("The 4th element of list b is " + b.getElement(4));
		System.out.println("The 18th element of list c is " + c.getElement(18));
		System.out.println();

		System.out.println("The 10th element of list a is " + a.getElement(10));
		System.out.println("The 5th element of list b is " + b.getElement(5));
		System.out.println("The 26th element of list c is " + c.getElement(26));
		System.out.println();
		
		
	}
}
