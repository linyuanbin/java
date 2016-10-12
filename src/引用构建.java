
public class 引用构建 {
	public static void main(String[] args){
	//person per=new person(15,13244236666L,"吉林","成龙");//访问成员变量用“引用.”的方式。不可直接访问。静态方法不可用“this”关键字去访问。需创建引用、
	/*per.age=15;
	per.name="成龙";
	per.number=13244236666L;
	per.addres="吉林";*/
	//System.out.println(""+per.name);
	//System.out.println(""+per.age);
	//System.out.println(""+per.addres);
	//System.out.println(""+per.number);
	//System.out.println(this.name);错误的。静态方法（即 static）不可用this;
		  Person.m2();
		mydate day=new mydate(2015,12,12);
		System.out.println("生效时间："+day.year+"年"+day.month+"月"+day.day+"日");
	}

}

class Person{
	int age;
	String name;
	String addres;
	long number;
Person() {}

Person(int age,long number,String addres,String name){
	this.age=age;
	this.name=name;
	this.number=number;
	this.addres=addres;
}
public static void m2(){
	Person per=new Person(15,13244236666L,"吉林","成龙");//访问成员变量用“引用.”的方式。不可直接访问。静态方法不可用“this”关键字去访问。需创建引用、
	System.out.println("姓名："+per.name);
	System.out.println("年龄："+per.age);
	System.out.println("住址："+per.addres);
	System.out.println("电话："+per.number);
}
}


//this用于构建函数中
class mydate{
	int year;
	int month;
	int day;
mydate(){                                             //默认值设置为2015.11.11
this(2015,11,11);   //此句代码等同于以下三句。不过this调用函数只可用于改方法的   第一句,做用是实现代码重复利用
	                                 /*this.year=year;
this.month=month;
this.day=day;*/
//this(2015,11,11);此句错误。因为不在该方法   第一行；
	
}	
mydate(int _year,int _month,int _day){
year=_year;
month=_month;
day=_day;
	}
}