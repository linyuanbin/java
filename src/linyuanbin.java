
public class linyuanbin {
public static void main(String args[])
{double a=123456789.123456789;
int b=(int)a;
int c[]={12,25,32};
char d[]={'北','华','大','学'};
	System.out.println("a="+a);
	System.out.println(":"+123+"大于"+122);
	System.out.printf("%d,%f",12,12.50);
	System.out.println("\nb="+b);
	System.out.println("数组c的引用="+c);
	System.out.println("c数组长度="+c.length);
	System.out.println("c[0]="+c[0]+",c[1]="+c[1]+",c[2]="+c[2]);
	System.out.println(d);
	System.out.println("数组d的引用："+d);
	
	
	char t='好';
	char you='\u4f60';
	System.out.println("汉字"+t+"在Unicode表的位置是   "+(int)t);
	System.out.println("you:"+you);
	
	//以下为特殊输出，不可直接键盘打入。需要用转义字符方式输出
	
	System.out.println('\\');//输出一条斜线
	System.out.println('\n');//换行
	System.out.println('\t');//水平制表
	System.out.println('\'');//输出单引号
	System.out.println('\"');//输出双引号
}
}
