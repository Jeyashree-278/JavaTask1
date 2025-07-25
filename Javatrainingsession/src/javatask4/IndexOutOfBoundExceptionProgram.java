package javatask4;

public class IndexOutOfBoundExceptionProgram {

	public static void main(String[] args) 
	{
		ArrayIndexExample();
		StringIndexExample();
	}
		public static void  ArrayIndexExample()
		{
			try {
				int a[]= {1,2,3,4,5};
				int c=a[4];
				System.out.println(c);
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Enter Valid index in an array");
			}
		}
			public static void  StringIndexExample()
			{
				try
				{
					String str="Jeyashree";
					char s=str.charAt(8);
					System.out.println(s);
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println(e.getMessage());
					System.out.println("Enter Valid index");
				}
			}
		

	

	
}
