
public class privateGetSet {
	public static void main(String sage[]){
	
		//创建peivate类的对象a
		peivate a=new peivate();
		a.setAge(5);     //赋值
		System.out.println(a.getAge());
	
		a.name="张三疯";
		a.sex=true;
		System.out.println(a.name);
		System.out.println("sex="+(a.sex?"男":"女"));
		
		
		
		System.out.println("下面输出调用函数的值：");
		//调用构造函数   xxx=new +方法名（实参）；
		peivate f1=new peivate();
		peivate f2=new peivate(170);
		peivate f3=new peivate("吉林省");
		System.out.println(f1.height);
		System.out.println(f1.addres);
		System.out.println(f2.height);
		System.out.println(f2.addres);
		System.out.println(f3.height);
		System.out.println(f3.addres);
		
		/*int n[];//数组在定义时不加元素个数
	    n=new int[5];//数组分配元素  数组名=new+数据类型[个数]；
		还可直接写   int n[]=new int[5];
	    int n[]={5,8,9,6,2};
		
		for(int k:n)
			System.out.println(""+k);*/
	}
}
