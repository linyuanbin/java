
import java.util.*;
public class studentttttt {
	public static void main(String[] args)
	{
		int star=0,end,middle;
		int a[]={15,54,22,-8,65};
		int n=a.length;
		for(int i=0;i<n;i++)
			{for(int j=i+1;j<n;j++)
			  {if(a[i]>a[j])
			  {int t=a[i];
			    a[i]=a[j];
			    a[j]=t;
			  }
			}
		}
		Scanner river=new Scanner(System.in);
		System.out.println("pleaseInputTheNumber");
		int number=river.nextInt();
		int count=0;
		end=n;
		middle=(star+end)/2;
		while(number!=a[middle])
		{
			if(number>a[middle])
			star=middle;
			else if(number<a[middle])
				end=middle;
			middle=(star+end)/2;
			count++;
			if(count>n/2)
				break;			
		}
		if(count>n/2)
			System.out.printf("%d不在其中.\n", number);
		else
			System.out.printf("%d在其中.\n",number);		
	}

}
