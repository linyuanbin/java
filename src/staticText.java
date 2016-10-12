
public class staticText {
	//static定义的静态语句块在类加载时就执行。且 只执行一次。至上而下执行。比main还快。
static{System.out.print(" "+"1");}
static{System.out.print(" "+"2");}
static{System.out.print(" "+"3");}
static{System.out.println(" "+"4");}

//以下是实例语句块
{  System.out.print(" "+"a");//在调用之前运行。需要用
	}
{  System.out.print(" "+"b");
}
{  System.out.println(" "+"c");
}


public static void main(String[] args){
	System.out.println("main punish!");

  new staticText();//调用几次构造函数则输出几次.      相当staticTex xx=new staticTex;println(xx)
  new staticText();
  new staticText();
 /* staticText m2=new staticText();
  System.out.println(m2);不可用*/
}
}
