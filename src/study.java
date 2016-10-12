import java.util.Scanner;
public class study {
	public static void main(String args[])
	{
		System.out.println("请输入若干数值，每输入一个回车确认");
		System.out.println("最后输入0结束输入操作");
		Scanner reader= new Scanner(System.in);
				double sum=0;
				double x=reader.nextDouble();
				while(x!=0)
				{
					sum=sum+x;
					x=reader.nextDouble();
				}
				System.out.println("sum= "+sum);
	}

}
