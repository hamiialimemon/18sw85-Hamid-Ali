class MultiArrays{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
					continue;
				}
				System.out.println(j);
			}
			System.out.println("Out of nexted Loop");
		}
		System.out.println("out of outer");
	}
}