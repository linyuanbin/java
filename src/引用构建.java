
public class ���ù��� {
	public static void main(String[] args){
	//person per=new person(15,13244236666L,"����","����");//���ʳ�Ա�����á�����.���ķ�ʽ������ֱ�ӷ��ʡ���̬���������á�this���ؼ���ȥ���ʡ��贴�����á�
	/*per.age=15;
	per.name="����";
	per.number=13244236666L;
	per.addres="����";*/
	//System.out.println(""+per.name);
	//System.out.println(""+per.age);
	//System.out.println(""+per.addres);
	//System.out.println(""+per.number);
	//System.out.println(this.name);����ġ���̬�������� static��������this;
		  Person.m2();
		mydate day=new mydate(2015,12,12);
		System.out.println("��Чʱ�䣺"+day.year+"��"+day.month+"��"+day.day+"��");
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
	Person per=new Person(15,13244236666L,"����","����");//���ʳ�Ա�����á�����.���ķ�ʽ������ֱ�ӷ��ʡ���̬���������á�this���ؼ���ȥ���ʡ��贴�����á�
	System.out.println("������"+per.name);
	System.out.println("���䣺"+per.age);
	System.out.println("סַ��"+per.addres);
	System.out.println("�绰��"+per.number);
}
}


//this���ڹ���������
class mydate{
	int year;
	int month;
	int day;
mydate(){                                             //Ĭ��ֵ����Ϊ2015.11.11
this(2015,11,11);   //�˾�����ͬ���������䡣����this���ú���ֻ�����ڸķ�����   ��һ��,������ʵ�ִ����ظ�����
	                                 /*this.year=year;
this.month=month;
this.day=day;*/
//this(2015,11,11);�˾������Ϊ���ڸ÷���   ��һ�У�
	
}	
mydate(int _year,int _month,int _day){
year=_year;
month=_month;
day=_day;
	}
}