
public class privateGetSet {
	public static void main(String sage[]){
	
		//����peivate��Ķ���a
		peivate a=new peivate();
		a.setAge(5);     //��ֵ
		System.out.println(a.getAge());
	
		a.name="������";
		a.sex=true;
		System.out.println(a.name);
		System.out.println("sex="+(a.sex?"��":"Ů"));
		
		
		
		System.out.println("����������ú�����ֵ��");
		//���ù��캯��   xxx=new +��������ʵ�Σ���
		peivate f1=new peivate();
		peivate f2=new peivate(170);
		peivate f3=new peivate("����ʡ");
		System.out.println(f1.height);
		System.out.println(f1.addres);
		System.out.println(f2.height);
		System.out.println(f2.addres);
		System.out.println(f3.height);
		System.out.println(f3.addres);
		
		/*int n[];//�����ڶ���ʱ����Ԫ�ظ���
	    n=new int[5];//�������Ԫ��  ������=new+��������[����]��
		����ֱ��д   int n[]=new int[5];
	    int n[]={5,8,9,6,2};
		
		for(int k:n)
			System.out.println(""+k);*/
	}
}
