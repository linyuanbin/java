/*
 * 搜索输入数据是否在数组中
 */
import java.util.*;
public class ootext {
	public static void main(String[] args){
		int a[]={56,64,3,5,66,33,11,44};
		int star=0,end,middle,n=a.length;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j])
			    {
					int t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			Scanner numb=new Scanner(System.in);
			System.out.println("please input a number--->");
			int number=numb.nextInt();
			end=n;
			middle=(star+end)/2;
			int flag=0;
			while(number!=a[middle])
			{
				if(number>a[middle])
				star=middle;
				else if(number<a[middle])
					end=middle;
				middle=(star+end)/2;
				flag++;
				if(flag>n/2) break;
			}
			if(flag>n/2)
				System.out.println("NO!");
			else 
				System.out.println("YES!");		
	}

}
