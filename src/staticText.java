
public class staticText {
	//static����ľ�̬�����������ʱ��ִ�С��� ִֻ��һ�Ρ����϶���ִ�С���main���졣
static{System.out.print(" "+"1");}
static{System.out.print(" "+"2");}
static{System.out.print(" "+"3");}
static{System.out.println(" "+"4");}

//������ʵ������
{  System.out.print(" "+"a");//�ڵ���֮ǰ���С���Ҫ��
	}
{  System.out.print(" "+"b");
}
{  System.out.println(" "+"c");
}


public static void main(String[] args){
	System.out.println("main punish!");

  new staticText();//���ü��ι��캯�����������.      �൱staticTex xx=new staticTex;println(xx)
  new staticText();
  new staticText();
 /* staticText m2=new staticText();
  System.out.println(m2);������*/
}
}
