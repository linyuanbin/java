//1+1/2!+1/3!+1/4!....前二十个和
public class SearchFor {
	public static void main(String[] args)
	{
		double sum=0,g=1;
		int i=1,n=20,j;
		while(i<=n)
		{
			sum=sum+g;
			i++;
			g=g*(1.0/i);
		}
		System.out.println("sum="+sum);
		
	int t,u=0;
	for(t=2;t<=200;t++){
		for(j=2;j<=t/2;j++)
	      {if(t%j==0)
	    	break;
	      }
	      if(j>=t/2+1)
	    	  System.out.print("  "+t);
	          u++;
	           if(u%10==0)
	    	  	System.out.print("\n");
	       }
	
	
	
	}
}
