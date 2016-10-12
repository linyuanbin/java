//对于数据的加密与对get set 函数的使用
public class peivate {
	private int age;
	String name;//首字母大写
	boolean sex;
	int height;
	String addres;
	
	
public void setAge(int _age)
{//对年龄的校对验证
	if(_age<0||_age>200)
	   {System.out.println("您输入的年龄不合法");
		return;
	    }
	age=_age;
	}
 public int getAge(){

	return age;
	
}
 
 //构造函数 不加返回值类型。否则就变成普通函数。
 peivate(){}
 peivate(int _height){
	 height=_height;
 }
 peivate(String _addres){
	 addres=_addres;
 }
}