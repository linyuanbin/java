
public class linyuanbin {
public static void main(String args[])
{double a=123456789.123456789;
int b=(int)a;
int c[]={12,25,32};
char d[]={'��','��','��','ѧ'};
	System.out.println("a="+a);
	System.out.println(":"+123+"����"+122);
	System.out.printf("%d,%f",12,12.50);
	System.out.println("\nb="+b);
	System.out.println("����c������="+c);
	System.out.println("c���鳤��="+c.length);
	System.out.println("c[0]="+c[0]+",c[1]="+c[1]+",c[2]="+c[2]);
	System.out.println(d);
	System.out.println("����d�����ã�"+d);
	
	
	char t='��';
	char you='\u4f60';
	System.out.println("����"+t+"��Unicode���λ����   "+(int)t);
	System.out.println("you:"+you);
	
	//����Ϊ�������������ֱ�Ӽ��̴��롣��Ҫ��ת���ַ���ʽ���
	
	System.out.println('\\');//���һ��б��
	System.out.println('\n');//����
	System.out.println('\t');//ˮƽ�Ʊ�
	System.out.println('\'');//���������
	System.out.println('\"');//���˫����
}
}
