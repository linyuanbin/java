//�������ݵļ������get set ������ʹ��
public class peivate {
	private int age;
	String name;//����ĸ��д
	boolean sex;
	int height;
	String addres;
	
	
public void setAge(int _age)
{//�������У����֤
	if(_age<0||_age>200)
	   {System.out.println("����������䲻�Ϸ�");
		return;
	    }
	age=_age;
	}
 public int getAge(){

	return age;
	
}
 
 //���캯�� ���ӷ���ֵ���͡�����ͱ����ͨ������
 peivate(){}
 peivate(int _height){
	 height=_height;
 }
 peivate(String _addres){
	 addres=_addres;
 }
}