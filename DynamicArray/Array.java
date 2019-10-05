
class Array
{
	private String[] arrayName;
	private int BASE, length;
	
	public Array()
	{
		arrayName = new String[1];
		BASE = 0;
		length = 0;
	}
	
	public Array(int initialSize)
	{
      	arrayName = new String[initialSize];
		BASE = 0;
		length = initialSize;    
	}
	
	public Array(int initialSize, int base)
	{
      	arrayName = new String[initialSize];
		BASE = base;
		length = initialSize;      	
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
			element = arrayName[index-BASE];			
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
		if((index-BASE)>=0 && (index-BASE) < length)
		{
			arrayName[index-BASE] = newValue;      			
		}
		else
		{
			//throw new RuntimeException(" index = " + index + " size " + length);
			System.err.println(" base = " + BASE + " index = " + index + " size " + length);
		}
	}

	public void expand(int increment)
	{
		length = length + increment;
		String[] result = new String[length];
		System.arraycopy(arrayName,0,result,0,(length-increment));
		arrayName = result;		
	}
}
