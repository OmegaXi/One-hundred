package two;

import java.util.Scanner;
//����������е������
public class Rev2 {
	public static String reverse(String s){
		char[] arr=s.toCharArray();//�ַ���ת��Ϊ�ַ�����
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
			rev+=arr[i];
		return rev;
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
