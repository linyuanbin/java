import java.util.*;
public class scanner {
public static void main(String[] args){
	//int i;
	Scanner number=new Scanner(System.in);
	double p=1,j;
	int result;
	int i=number.nextInt();
	for(j=1;j<=i;j++)
	{
		p*=j;
	}
	System.out.println(i+"µÄ½×²ã="+p);
	result=a(6);
	System.out.println("6µÄ½×²ã="+result);

}
public static int a(int m){
	if(m==1)
	return 1;
	    else
		return m*a(m-1);
}
}

