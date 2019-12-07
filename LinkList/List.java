//Hidear Talirongan
//Data Structure
//Dynamic List



class Node
{
	String element;
	Node next;
	
	public Node(String element, Node next)
	{
		this.element = element;
		this.next = next;
	}
}

class List
{
	private int BASE, length;
	protected Node firstNode;
	
	public List()
	{
		BASE = 0;
		length = 0;
		firstNode = new Node(null, firstNode);
		Node pointer = firstNode;
	}
	
	public List(int initialSize)
	{
      	BASE = 0;
		length = initialSize;
		firstNode = new Node(null, firstNode);
		Node pointer = firstNode;
		for(int i = 1; i < length; i ++)
		{
			pointer.next = new Node(null, pointer.next);
			pointer = pointer.next;		
		}
	}
	
	public List(int initialSize, int base)
	{
      	BASE = base;
		length = initialSize;
		firstNode = new Node(null, firstNode);
		Node pointer = firstNode;
		for(int i = 1; i < length; i ++)
		{
			pointer.next = new Node(null, pointer.next);
			pointer = pointer.next;		
		}
	}

	public int getSize()
	{
		return length;
	}
	
	public void setSize(int size)
	{
		length = size;	
	}
	
	public void setBase(int base)
	{
		BASE = base;
	}

	public int getBase()
	{
		return BASE;
	}

	public String getElement(int index)
	{
		String element = null;
		if((index-BASE)>=0 && (index-BASE) < length)
		{
			Node node = firstNode;
			for(int i = 0; i < (index-BASE); i++)
			{
				node = node.next;
			}
			element = node.element;
		}
		else
		{
			//throw new RuntimeException(" index = " + index + " size " + length);
			System.err.println(" base = " + BASE + " index = " + index + " size " + length);
		}
		return element;
	}

	public void setElement(int index, String newValue)
	{
		if(((index-BASE)>=0) && ((index-BASE) < length))
		{
			Node node = firstNode;
			for(int i = 0; i < (index-BASE); i++)
			{
				node = node.next;
			}
			node.element = newValue;						
		}
		else
		{
			//throw new RuntimeException(" index = " + index + " size " + length);
			System.err.println(" base = " + BASE + " index = " + index + " size " + length);
		}
	}

	public void expand(int increment)
	{
		Node pointer = firstNode;
		for(int i = 0; i < length; i++)
		{
			pointer = pointer.next;
		}			
		pointer.next = new Node(null, pointer);
		pointer = pointer.next;
		for(int j = length; j < (length+increment); j++)
		{
			pointer.next = new Node(null, pointer.next);
			pointer = pointer.next;
		}
		length = length + increment;
	}	
}
