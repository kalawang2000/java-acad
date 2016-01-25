class prime {
    public static void main(String[] args) {
		int n=100;
		boolean  pr;
		for (int i=1;i<=n; i++)
		{
			pr=false;
		
			for (int j=2;j<i; j++)
			{
				if (i%j==0) 
				{
					pr=true;
					break;
				}			  
			   
			}
			if (pr==false)
			System.out.print(i+ " ");
		}
		
    }
}