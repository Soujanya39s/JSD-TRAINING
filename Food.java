interface Cookable
{
   public void cook(); 
}
class Food
{
	public static void main(String []args)
	{
		Cookable c = new Cookable()
		{
			public void cook()
			{
				System.out.println("Anonymous Cookable implimenter");
			}
	    };
		c.cook();
	}
}


