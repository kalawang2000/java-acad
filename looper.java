class looper {
    public static void main(String[] args) {
		
		int l=0;

	
		  for (int j=1;j<=10; j++)
		    {
				for (int k=1;k<=j-l; k++)
					{
						System.out.print(k+ " ");
					}
				if (j >= 5) l=l+2;	
			  System.out.println("");
			}
		  

		
    }
}