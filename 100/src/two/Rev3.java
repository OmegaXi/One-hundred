package two;

import java.util.Scanner;
//StringBuffer���õ�reverse����
public class Rev3 {
	public static String reverse(String s){
		String ss=new StringBuffer(s).reverse().toString();
		return ss;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ת���ַ�����");
		String str1=sc.nextLine();//��ȡ�ַ���������
		String str2=reverse(str1);
		System.out.println(str2);
	}

}
