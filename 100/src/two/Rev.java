package two;

import java.util.Scanner;

//�ݹ�
public class Rev {
	public static String reverse(String s){
		int length=s.length();
		if(length<=1)
			return s;//�ַ���ֻ��һ���ַ��Ļ���ֱ��������������ݹ鵽ֻ��һλ��ʱ�򣬾ͻ����
		String left=s.substring(0,length/2);//��ȡ�ӵ�һλ���ַ����м���ַ���
		String right=s.substring(length/2,length);//��ȡ���м䵽���һλ���ַ�����
		return reverse(right)+reverse(left);//�Խ�ȡ�����������ַ������еݹ飬ע��˳������������
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ת���ַ�����");
		String str1=sc.nextLine();//��ȡ�ַ���������
		String str2;
		str2=reverse(str1);
		System.out.println(str2);
	}

}
